/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.mid;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author GA
 */
public class client {
    public static void main(String[] args) {
        try{
            
            Socket s = new Socket("localhost", 786);
            
            DataOutputStream doutstream = new DataOutputStream(s.getOutputStream());
            
            doutstream.writeUTF("Ghulam Abbas");
            
            doutstream.flush();
            doutstream.close();
            s.close();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
