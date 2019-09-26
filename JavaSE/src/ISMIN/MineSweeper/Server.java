package ISMIN.MineSweeper;

import javax.swing.*;
import java.net.* ; // Sockets
import java.io.* ; // Streams
public class Server extends JFrame implements Runnable {

    private IhmServer ihmServer;
    private ServerSocket serverSocket;

    public Server(){
        ihmServer= new IhmServer(this) ;
        setContentPane(ihmServer) ;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack() ;
        setVisible(true) ;
        startServer();
    }

     void startServer(){
        ihmServer.addMessage("Wait for clients...\n");
        try{
            //launch the management of socket
            serverSocket = new ServerSocket(AppMinesweeper.PORT);
            //launch a thread for waiting client
            new Thread(this).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
     }

     public void run(){
         try {
             Socket socket = serverSocket.accept();  //new client
             ihmServer.addMessage("New client\n");
             new Thread(this).start();        //launch a wait for client

             //open in/out
             //stock in 2 collection
             //infinite loop of waiting clients' messages
             //re-dispatch others if necessary

         } catch (IOException e) {
             e.printStackTrace();
         }
     }

    public static void main(String [] args) {
        new Server();

    }
}
