package com.rahul.inheritance2;

public class Bike extends Vehicles {
    int seats;

    public Bike(String vehicleName, int tires, String fueltype, int seats) {
        super(vehicleName, tires, fueltype);
        this.seats = seats;
    }
}
