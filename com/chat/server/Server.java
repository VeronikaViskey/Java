package com.chat.server;

import com.chat.auth.AuthenticationService;

public interface Server {
    void sendMsgTo(ClientHandler from, String to, String msg);
    void broadcastMessage(String message);
    boolean isLoggedIn(String nickname);
    void subscribe(ClientHandler client);
    void unsubscribe(ClientHandler client);
    AuthenticationService getAuthenticationService();
}
