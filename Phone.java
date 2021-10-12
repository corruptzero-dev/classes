package com.company;

public class Phone {
    long serialNumber;
    String model;
    short weight;

    public Phone(long serialNumber, String model, short weight) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String model) {
        this.model = model;
    }
    public Phone(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void showInfo(){
        System.out.println(this.model
                + " "
                + this.serialNumber
                + " "
                + this.weight);
    }
    public void receiveCall(String name){
        System.out.println(name);
    }
    public long getSerialNumber() {
        return serialNumber;
    }

}
