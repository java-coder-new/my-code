package com.rahul.inheritance2;

public class Truck extends Vehicles{
    int weight;

    public Truck(String vehicleName, int tires, String fueltype, int weight) {
        super(vehicleName, tires, fueltype);
        this.weight = weight;
    }
}
