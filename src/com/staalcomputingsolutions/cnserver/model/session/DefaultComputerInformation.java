/*
 * Copyright [2015] [Charles Joseph Staal]
 */
package com.staalcomputingsolutions.cnserver.model.session;

/**
 *
 * @author Charles Joseph Staal
 */
public class DefaultComputerInformation implements ComputerInformation{

    private final String uuid, name, localIP;

    public DefaultComputerInformation(String name, String localIP) {
        this.uuid = java.util.UUID.randomUUID().toString();
        this.name = name;
        this.localIP = localIP;
    }

    public String getUUID() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    public String getLocalIP() {
        return this.localIP;
    }

    public String toString() {
        return "UUID=" + this.getUUID() + ";NAME=" + this.getName() + "LOCALIP=" + this.getLocalIP();
    }
}
