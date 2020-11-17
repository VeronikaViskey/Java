package com.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Objects;

public class ClientHandler {
    private Server server;
    private Socket socket;
    private ChatServer chatServer;
    private DataInputStream in;
    private DataOutputStream out;
    private String name;
    private boolean isAuthFinish = false;

    public ClientHandler(Server server, Socket socket) {
        try {
            this.server = server;
            this.socket = socket;
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            doListen();
        } catch (IOException e) {
            throw new RuntimeException("SWW", e);
        }
    }

    public String getName() {
        return name;
    }

    private void doListen() {
        new Thread(() -> {
            try {
                doAuth();
                receiveMessage();
            } catch (Exception e) {
                throw new RuntimeException("SWW", e);
            } finally {
                server.unsubscribe(this);
            }
        }).start();
    }

    private void doAuth() {
        try {
            while (true) {
                String credentials = in.readUTF();
                if (credentials.startsWith("-auth")) {
                    String[] credentialValues = credentials.split("\\s");
                    server.getAuthenticationService()
                            .doAuth(credentialValues[1], credentialValues[2])
                            .ifPresentOrElse(
                                    user -> {
                                        if (!server.isLoggedIn(user.getNickname())) {
                                            sendMessage("cmd auth: Status OK");
                                            name = user.getNickname();
                                            server.broadcastMessage(name + " is logged in.");
                                            server.subscribe(this);
                                            isAuthFinish = true;
                                        } else {
                                            sendMessage("Current user is already logged in.");
                                        }
                                    },
                                    new Runnable() {
                                        @Override
                                        public void run() {
                                            sendMessage("No a such user by email and password.");
                                        }
                                    }
                            );
                }
                if(isAuthFinish) {
                    return;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("SWW", e);
        }
    }

    /**
     * Receives input data from {@link ClientHandler#in} and then broadcast via {@link Server#broadcastMessage(String)}
     */
    private void receiveMessage() {
        try {
            while (true) {
                String message = in.readUTF();
                if (message.equals("-exit")) {
                    return;
                }
                ///Домашнее задание:
                if (message.startsWith("/w")){
                    String[] credential = message.split("\\s");
                    String nick = credential[1];
                    String msg = message.substring(4 + nick.length());
                    chatServer.sendMsgTo(this, nick, msg);
                }
                ///
                server.broadcastMessage(message);
            }
        } catch (IOException e) {
            throw new RuntimeException("SWW", e);
        }
    }

    public void sendMessage(String message) {
        try {
            out.writeUTF(message);
        } catch (IOException e) {
            throw new RuntimeException("SWW", e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientHandler that = (ClientHandler) o;
        return Objects.equals(server, that.server) &&
                Objects.equals(socket, that.socket) &&
                Objects.equals(in, that.in) &&
                Objects.equals(out, that.out) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, socket, in, out, name);
    }
}
