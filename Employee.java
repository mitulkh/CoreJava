package com.exampleJava;

/**
 * Practical 11 : program to use this/super variable
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
class Person {

    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

public class Employee extends Person {

    float salary;

    Employee(int id, String name, float salary) {
        super(id, name); // Super keyword used for accessing parent class variable
        this.salary = salary; // This keyword used for current class instance variable
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
    }

    public static void main(String[] args) {
        new Employee(102, "James", 10000);
    }

}