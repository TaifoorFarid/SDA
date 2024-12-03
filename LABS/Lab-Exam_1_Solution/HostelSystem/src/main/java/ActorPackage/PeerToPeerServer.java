/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActorPackage;
  import java.io.*;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class PeerToPeerServer
{ 
 
    private static final int PORT = 5035;

    public static void main(String[] args) throws IOException {
        // Create server socket to listen for incoming connections
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Peer is listening on port " + PORT);

        // Thread to handle incoming connections
        Thread serverThread = new Thread(() -> {
            try {
                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    String message = in.readLine();
                    System.out.println("Received: " + message);
                    String ip = clientSocket.getInetAddress().toString().split("/")[1];
                    System.out.println("client is :"+ip +" and port is "+clientSocket.getPort());
                    
                    try (Socket socket = new Socket(ip, 5015)) {
                        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                        out.println("Successfully got your message Taimoor ...");
                    }
                    clientSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        serverThread.start();
try (
        Socket socket = new Socket("localhost", 5015)) 
        {
                        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                        Scanner s = new Scanner(System.in);
                        var selfMess = s.nextLine();
                        if(selfMess.equals("exit")){
                        System.out.println("Shutting down the server .... ");
                        serverSocket.close();
                        }
                        out.println("EXIT");
                    }
        
        
        
    }
    
//    public static void main(String[] args) throws IOException {
//        // Create server socket to listen for incoming connections
//        ServerSocket serverSocket = new ServerSocket(PORT);
//        System.out.println("Peer is listening on port " + PORT);
//
//        // Thread to handle incoming connections
//        Thread serverThread = new Thread(() -> {
//            try {
//                while (true) {
//                    // Accept an incoming client connection
//                    Socket clientSocket = serverSocket.accept();
//                    
//                    // Read message from the client
//                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//                    String message = in.readLine();
//                    System.out.println("Received: " + message);
//                    
//                    // Get client's IP and port
//                    String clientIP = clientSocket.getInetAddress().getHostAddress();
//                    int clientPort = clientSocket.getPort();
//                    System.out.println("Client IP: " + clientIP + ", Client Port: " + clientPort);
//                    
//                    // Respond to the client directly on the same connection
//                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//                    out.println("Successfully received your message, Taifoor Farid. Responding to IP: " + clientIP + ", Port: " + clientPort);
//                    
//                    // Close the client socket
//                    clientSocket.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//        
//        serverThread.start();
//    }
}