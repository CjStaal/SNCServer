/*
 * Copyright [2015] [Charles Joseph Staal]
 */
package com.staalcomputingsolutions.cnserver.model.clientinformation;

/**
 *
 * @author Charles Joseph Staal
 */
public class ClientInformation {
    
    private final String name, phoneNumber;
    
    public ClientInformation(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    public String infoString(){
        return "NAME="+ getName() + ";PHONENUMBER="+ getPhoneNumber();
    }
    
    private String getName(){
        return name;
    }
    
    private String getPhoneNumber(){
        return phoneNumber;
    }
}
