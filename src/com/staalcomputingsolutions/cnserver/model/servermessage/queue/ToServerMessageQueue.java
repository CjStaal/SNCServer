/*
 * Copyright [2015] [Charles Joseph Staal]
 */
package com.staalcomputingsolutions.cnserver.model.servermessage.queue;

import com.staalcomputingsolutions.cnserver.model.servermessage.ServerMessage;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Charles Joseph Staal
 */
public class ToServerMessageQueue {
    private static BlockingQueue<ServerMessage> messageQueue;
    
    public ToServerMessageQueue(){
        this.messageQueue = new ArrayBlockingQueue(100);
    }
    
    public static void addToQueue(ServerMessage message){
        messageQueue.add(message);
    }
    
    public static ServerMessage take() throws InterruptedException{
            return messageQueue.take();
    }
}
