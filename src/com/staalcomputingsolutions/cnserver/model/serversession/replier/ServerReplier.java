/*
 * Copyright [2015] [Charles Joseph Staal]
 */
package com.staalcomputingsolutions.cnserver.model.serversession.replier;

import com.staalcomputingsolutions.cnserver.model.servermessage.parser.MessageToServerParser;
import com.staalcomputingsolutions.cnserver.model.servermessage.queue.ToServerMessageQueue;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Charles Joseph Staal
 */
public class ServerReplier {

    private final OutputStream outputStream;
    private final DataOutputStream dataOutputStream;

    public ServerReplier(OutputStream outputStream) {
        this.outputStream = outputStream;
        this.dataOutputStream = new DataOutputStream(outputStream);
    }

    private void send() {
        try {
            this.dataOutputStream.writeUTF(MessageToServerParser.parse(ToServerMessageQueue.take()));
        } catch (InterruptedException | IOException ex) {
            Logger.getLogger(ServerReplier.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void send(String infoString) throws IOException {
        this.dataOutputStream.writeUTF(infoString);
    }
}
