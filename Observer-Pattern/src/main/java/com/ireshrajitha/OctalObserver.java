package com.ireshrajitha;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println("Binary String: " + Integer.toOctalString( subject.getState()));
    }
}
