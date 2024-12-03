/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActorPackage;

import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Dell
 */
public class PeerToPeerClient
{
    public static void main(String[] args)
    {
//                 Connect to another peer and send a message
        try (Socket socket = new Socket("172.20.50.44", 5015)) {
            while (true)
            {
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println("Hello from peer!");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
