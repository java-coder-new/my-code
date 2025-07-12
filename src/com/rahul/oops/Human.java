package com.rahul.oops;

public class Human {
    String name;
    int age;
    float weight;
    float height;
    static long population;

    public Human(String name, int age, float weight, float height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        Human.population += 1;
    }

}