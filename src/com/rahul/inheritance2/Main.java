package com.rahul.inheritance2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car", 4, "diesel", 120);
        System.out.println("vehicle name: "+ car.vehicleName);
        System.out.println("numbers of tires: "+ car.tires);
        System.out.println("type of fuel: "+ car.fueltype);
        System.out.println("top speed: "+ car.speed +"KMPH");
        System.out.println();

        Bike bike = new Bike("bike", 2, "petrol", 2);
        System.out.println("vehicle name: "+ bike.vehicleName);
        System.out.println("numbers of tires: "+ bike.tires);
        System.out.println("type of fuel: "+ bike.fueltype);
        System.out.println("number of seats: "+ bike.seats);
        System.out.println();

        Truck truck = new Truck("truck", 6, "CNG", 1000);
        System.out.println("vehicle name: "+ truck.vehicleName);
        System.out.println("numbers of tires: "+ truck.tires);
        System.out.println("type of fuel: "+ truck.fueltype);
        System.out.println("Weight: "+ truck.weight+"kg");
    }
}
