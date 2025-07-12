package com.rahul.inheritance;

public class Dog extends Species {
    double tailLength;

    public Dog(int age, double height, double weight, double tailLength) {
        super(age, height, weight);
        this.tailLength = tailLength;
    }
}
