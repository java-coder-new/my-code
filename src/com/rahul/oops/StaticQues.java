package com.rahul.oops;
public class StaticQues {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aarav" , 1);
        Employee emp2 = new Employee("Harry" , 2);
        System.out.println(emp1.name);
        System.out.println(emp2.id);
        System.out.println(Employee.companyName);

        Employee.companyName = "XYZ Industries";
        System.out.println(Employee.companyName);
    }
}
class Employee {
    String name;
    int id;
    static String companyName = "ABC Industries";
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}