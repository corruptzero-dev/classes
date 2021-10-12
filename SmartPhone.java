package com.company;

public class SmartPhone extends Phone{
    boolean has5G;
    boolean hasNFC;
    boolean hasFingerPrint;
    boolean isLocked;
    public SmartPhone(long serialNumber, String model, short weight, boolean has5G, boolean hasNFC, boolean hasFingerPrint) {
        super(serialNumber, model, weight);
        this.has5G = has5G;
        this.hasNFC = hasNFC;
        this.hasFingerPrint = hasFingerPrint;
    }

    public SmartPhone(long serialNumber, String model, short weight) {
        super(serialNumber, model, weight);
    }
    public void unlockOrLock(){
        if(isLocked){
            this.isLocked = false;
            System.out.println("Телефон разблокирован");
        } else {
            this.isLocked = true;
            System.out.println("Телефон заблокирован");
        }
    }
}
