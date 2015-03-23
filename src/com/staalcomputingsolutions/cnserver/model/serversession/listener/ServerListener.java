/*
 * Copyright [2015] [Charles Joseph Staal]
 */
package com.staalcomputingsolutions.cnserver.model.serversession.listener;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Charles Joseph Staal
 */
public class ServerListener {

    private final InputStream inputStream;
    private final DataInputStream dataInputStream;

    public ServerListener(InputStream inputStream) {
        this.inputStream = inputStream;
        this.dataInputStream = new DataInputStream(inputStream);
    }

    public void listen() {
    }

    public String retrieve() throws IOException {
        return this.dataInputStream.readUTF();
    }

}
