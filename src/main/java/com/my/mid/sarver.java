
package com.my.mid;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class sarver {
    public static void main(String[] args)  {
        try {
            ServerSocket ss = new ServerSocket(786);
            
            System.out.println(" Establish is connection \n");
            Socket s = ss.accept();  
            System.out.println(" Connection Established \n");
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            
            ss.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
