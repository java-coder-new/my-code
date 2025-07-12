package com.rahul.oops;

public class Overloading {
    public static void main(String[] args) {
        Student stu1 = new Student("Tom");
        Student stu2 = new Student("Tim" , 22);
        Student stu3 = new Student("Harry" , 25 , "Computer science");

        stu3.student_detail();
        stu1.student_detail();
    }
}
class Student {
    String name;
    int age;
    String subject;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public Student(String name) {
        this.name = name;
    }

    void student_detail() {
        System.out.println("Student name is " + this.name);
        System.out.println("Student age is " + this.age);
        System.out.println("Student subject is " + this.subject);
    }
}
