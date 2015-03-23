/*
 * Copyright [2015] [Charles Joseph Staal]
 */
package com.staalcomputingsolutions.cnserver.model.serversession;

import com.staalcomputingsolutions.cnserver.model.clientinformation.ClientInformation;
import com.staalcomputingsolutions.cnserver.model.serversession.listener.ServerListener;
import com.staalcomputingsolutions.cnserver.model.serversession.replier.ServerReplier;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Charles Joseph Staal
 */
public class ServerSession {

    private final String serverIP;
    private final int serverPort;
    private final Socket socket;
    private final ServerReplier serverReplier;
    private final ServerListener serverListener;

    public ServerSession(String serverIP, int serverPort, ClientInformation clientInformation) throws IOException {
        this.serverIP = serverIP;
        this.serverPort = serverPort;

        this.socket = new Socket(this.serverIP, this.serverPort);
        this.serverReplier = new ServerReplier(socket.getOutputStream());
        this.serverListener = new ServerListener(socket.getInputStream());

        if (serverListener.retrieve().equals("READY")) {
            serverReplier.send("INFO:" + clientInformation.infoString());
        }
    }
}
