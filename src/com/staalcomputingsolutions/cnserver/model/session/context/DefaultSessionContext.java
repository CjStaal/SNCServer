/*
 * Copyright [2015] [Charles Joseph Staal]
 */
package com.staalcomputingsolutions.cnserver.model.session.context;

import com.staalcomputingsolutions.cnserver.model.session.ComputerInformation;
import com.staalcomputingsolutions.cnserver.model.session.listener.SessionListener;
import com.staalcomputingsolutions.cnserver.model.session.replier.SessionReplier;
import java.net.Socket;

/**
 *
 * @author Charles Joseph Staal
 */
public class DefaultSessionContext implements SessionContext{
    
    private ComputerInformation computerInformation;
    private SessionReplier sessionReplier;
    private SessionListener sessionListener;
    private final String uuid;
    private Socket socket;
    
    public DefaultSessionContext(){
        this.uuid = java.util.UUID.randomUUID().toString();
    }
    
    public void setComputerInformation(ComputerInformation computerInformation){
        this.computerInformation = computerInformation;
    }
    
    public ComputerInformation getComputerInformation(){
        return this.computerInformation;
    }
    
    public void setSessionReplier(SessionReplier sessionReplier){
        this.sessionReplier = sessionReplier;
    }
    
    public SessionReplier getSessionReplier(){
        return this.sessionReplier;
    }
    
    public void setSessionListener(SessionListener sessionListener){
        this.sessionListener = sessionListener;
    }
    
    public SessionListener getSessionListener(){
        return this.sessionListener;
    }
    
    public String getUUID(){
        return this.uuid;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
    
    public Socket getSocket(){
        return this.socket;
    }
    
}
