package com.ki.threds;

public class EventLoggingTask implements  Runnable{

    @Override
    public void run() {
    	System.out.println("Message");
    }
}