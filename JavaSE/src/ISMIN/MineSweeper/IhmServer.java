package ISMIN.MineSweeper;

import javax.swing.*;
import java.awt.*;

public class IhmServer extends JPanel {

    private Server server;
    private JButton startButton;
    private JTextArea messageArea = new JTextArea();


    public IhmServer(Server server){
        this.server = server;
        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());

        JLabel present = new JLabel("Minesweeper server");
        add(present,BorderLayout.NORTH);

        messageArea.setEditable(false);
        add(messageArea,BorderLayout.CENTER);

        startButton = new JButton("Start game");
        add(startButton,BorderLayout.SOUTH);

        //server.startServer();
    }

    public void addMessage(String s){
        messageArea.append(s);
    }

}
