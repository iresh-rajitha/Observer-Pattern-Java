package com.ireshrajitha;

public class main {
    public static void main(String[] args) {
        Subject subject = new Subject();

//        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 9");
        subject.setState(9);
        System.out.println("Second state change: 12");
        subject.setState(12);
    }
}
