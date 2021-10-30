package com.ireshrajitha;

import java.util.Observable;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject  = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString( subject.getState()));
    }
}
