package com.company;

public class Main {

    public static void main(String[] args) {
	    BabushkaPhone nokia = new BabushkaPhone(1234567890L,"Nokia 3310", (short) 133, true, true, true);
        SmartPhone samsung = new SmartPhone(9876543210L,"Samsung Galaxy A50", (short) 166, false,true,true);
        nokia.receiveCall("Путин");
        samsung.unlockOrLock();
        samsung.unlockOrLock();
        System.out.println(samsung.getSerialNumber());
    }
}
