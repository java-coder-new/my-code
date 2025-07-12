package com.rahul.inheritance2;

public class Car extends Vehicles {
    int speed;

    public Car(String vehicleName, int tires, String fueltype, int speed) {
        super(vehicleName, tires, fueltype);
        this.speed = speed;
    }
}
