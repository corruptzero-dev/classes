package com.company;

public class BabushkaPhone extends Phone{
    boolean hasInternet;
    boolean hasBluetooth;
    boolean hasFM;
    boolean isVolumeOn;

    public BabushkaPhone(long serialNumber, String model, short weight, boolean hasInternet, boolean hasBluetooth, boolean hasFM) {
        super(serialNumber, model, weight);
        this.hasInternet = hasInternet;
        this.hasBluetooth = hasBluetooth;
        this.hasFM = hasFM;
    }

    public BabushkaPhone(long serialNumber, String model, short weight) {
        super(serialNumber, model, weight);
    }
    @Override
    public void receiveCall(String name){
        System.out.println("Вам звонит " + name);
    }
    public void volumeOn(){
        if (isVolumeOn){
            System.out.println("Звук уже включен.");
        } else {
            System.out.println("Вы включили звук");
            this.isVolumeOn = true;
        }
    }
}
