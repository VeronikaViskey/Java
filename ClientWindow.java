
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClientWindow extends JFrame {

    private JTextField jtfMessage;
    private JTextArea jtaTextAreaMessage;


    public ClientWindow() {

            setBounds(600, 300, 600, 500);
            setTitle("Chat");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            jtaTextAreaMessage = new JTextArea();
            jtaTextAreaMessage.setEditable(false);
            jtaTextAreaMessage.setLineWrap(true);
            JScrollPane jsp = new JScrollPane(jtaTextAreaMessage);
            add(jsp, BorderLayout.CENTER);

            JPanel bottomPanel = new JPanel(new BorderLayout());
            add(bottomPanel, BorderLayout.SOUTH);

            JButton jbSendMessage = new JButton("Send");
            bottomPanel.add(jbSendMessage, BorderLayout.EAST);

            jtfMessage = new JTextField();
            bottomPanel.add(jtfMessage, BorderLayout.CENTER);

            jbSendMessage.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!jtfMessage.getText().trim().isEmpty()) {
                        jtaTextAreaMessage.setText(jtaTextAreaMessage.getText() + "\n" + jtfMessage.getText());
                        jtfMessage.setText("");
                    }
                    else {
                        jtaTextAreaMessage.setText(jtaTextAreaMessage.getText() + jtfMessage.getText());
                    }
                }
            });

        jtfMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jtfMessage.getText().trim().isEmpty()) {
                    jtaTextAreaMessage.setText(jtaTextAreaMessage.getText() + "\n" + jtfMessage.getText());
                    jtfMessage.setText("");
                }
                else {
                    jtaTextAreaMessage.setText(jtaTextAreaMessage.getText() + jtfMessage.getText());
                }
            }
        });
            setVisible(true);
    }
}
