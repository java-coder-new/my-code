package com.rahul.oops;

public class StudentCount {
    public static void main(String[] args) {
        Stud s1 = new Stud("Harry", 1);
        Stud s2 = new Stud("Tim", 2);
        System.out.println("Name: " + s1.name);
        System.out.println("id: " + s1.id);
        System.out.println("number of students are: " + Stud.count);

    }
}
class Stud {
    String name;
    int id;
    static int count = 0;

    public Stud(String name, int id) {
        this.name = name;
        this.id = id;
        count++;
    }
}