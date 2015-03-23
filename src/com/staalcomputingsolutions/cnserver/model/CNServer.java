/*
 * Copyright [2015] [Charles Joseph Staal]
 */
package com.staalcomputingsolutions.cnserver.model;

import com.staalcomputingsolutions.cnserver.model.clientinformation.ClientInformation;
import com.staalcomputingsolutions.cnserver.model.servermessage.queue.ToServerMessageQueue;
import com.staalcomputingsolutions.cnserver.model.serversession.ServerSession;
import com.staalcomputingsolutions.cnserver.model.session.SessionFactory;
import com.staalcomputingsolutions.cnserver.model.sessionhandler.SessionHandler;
import java.io.IOException;
import java.net.ServerSocket;
import javax.swing.JOptionPane;

/**
 *
 * @author Charles Joseph Staal
 */
public class CNServer {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String name = JOptionPane.showInputDialog("Please enter name:");
        String phoneNumber = JOptionPane.showInputDialog("Please enter phone number");
        
        ServerSocket serverSocket = new ServerSocket(1001);
        
        SessionHandler sessionHandler = new SessionHandler();
        
        ToServerMessageQueue tsmq = new ToServerMessageQueue();
        
        ServerSession serverSession = new ServerSession("127.0.0.1", 1000, new ClientInformation(name, phoneNumber));
        
        while(true){
            sessionHandler.addSession(SessionFactory.createSession(serverSocket.accept()));
        }
        
        
        
        
    }
    
}
