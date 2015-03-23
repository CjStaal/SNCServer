/*
 * Copyright [2015] [Charles Joseph Staal]
 */
package com.staalcomputingsolutions.cnserver.model.session;

import com.staalcomputingsolutions.cnserver.model.session.context.SessionContext;

/**
 *
 * @author Charles Joseph Staal
 */
public class DefaultSession implements Session{
    private final SessionContext sessionContext;
    
    public DefaultSession(SessionContext sessionContext){
        this.sessionContext = sessionContext;
    }
    
}
