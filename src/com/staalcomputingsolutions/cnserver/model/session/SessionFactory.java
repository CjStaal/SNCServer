/*
 * Copyright [2015] [Charles Joseph Staal]
 */
package com.staalcomputingsolutions.cnserver.model.session;

import com.staalcomputingsolutions.cnserver.model.session.context.DefaultSessionContext;
import com.staalcomputingsolutions.cnserver.model.session.listener.DefaultSessionListener;
import com.staalcomputingsolutions.cnserver.model.session.replier.DefaultSessionReplier;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Charles Joseph Staal
 */
public class SessionFactory {

    public static Session createSession(Socket socket) throws IOException {
        DefaultSessionListener sessionListener = new DefaultSessionListener(socket.getInputStream());
        DefaultSessionReplier sessionReplier = new DefaultSessionReplier(socket.getOutputStream());

        DefaultComputerInformation computerInformation = ComputerInformationFactory.createInformation(socket.getInputStream(), socket.getOutputStream());
        
        DefaultSessionContext sessionContext = new DefaultSessionContext();

        sessionContext.setComputerInformation(computerInformation);
        sessionContext.setSocket(socket);
        sessionContext.setSessionListener(sessionListener);
        sessionContext.setSessionReplier(sessionReplier);
        
        return new DefaultSession(sessionContext);

    }

}
