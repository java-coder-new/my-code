package com.rahul.oops;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Tom Holland", 26, 75.8f, 1.6f);
        Human human2 = new Human("Peter Parker", 16, 78.3f, 1.7f);
        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(Human.population);
        System.out.println(Human.population);

        greet();
    }

    void demo() {
        greet();
    }

    static void greet() {
        System.out.println("welcome");
    }
}
