package io.github.vijitha_venugopal.head_first_java.chapter_15;

import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * class using socket
 * Created by vijitha on 10/08/16.
 */
public class SimpleChatClientA {

    private JTextField outgoing;
    private PrintWriter writer;
    private Socket sock;

    private void go() {
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUpNetworking();
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    private void setUpNetworking() {
        try {
            // We're using localhost for testing
            sock = new Socket("127.0.0.1", 5000);
            // Make Socket and PrintWriter before displaying gui
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("Networking established.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            try {
                // Actually write. Writer is chained to input stream from socket.
                // So this is actually going out to the server.
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }

}