/*
 * Copyright [2015] [Charles Joseph Staal]
 */
package com.staalcomputingsolutions.cnserver.model.sessionhandler;

import com.staalcomputingsolutions.cnserver.model.session.Session;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charles Joseph Staal
 */
public class SessionHandler {
    
    private final List<Session> sessionList = new ArrayList();
    
    public SessionHandler(){
        
    }
    
    public void addSession(Session session){
        this.sessionList.add(session);
    }
}
