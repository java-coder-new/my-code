package com.rahul.inheritance;

public class Human extends Species {
    String degree;

    public void talk() {
        System.out.println("Human can talk");
    }

    public Human(int age, double height, double weight, String degree) {
        super(age, height, weight);
        this.degree = degree;
    }

}
