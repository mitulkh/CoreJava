package com.example_Java;

/**
 * Practical 12 : program to demonstrate static methods,variables and blocks
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class Company {

    int id;
    String employeeName;
    static String companyName = "Qdev"; // Static variable

    static void change() { // Static method
        companyName = "Shreehari";
    }

    static { // Static block
        System.out.println("Static block is initialized.");
    }

    Company(int id, String employeeName) {
        this.id = id;
        this.employeeName = employeeName;
        System.out.println("Company name:"+ companyName);
        System.out.println("Id:"+ id);
        System.out.println("Employee's name:"+ employeeName);
    }

    public static void main(String[] args) {
        Company.change(); // Calling change method
        Company company = new Company(101,"Mahesh"); // Creating Object
        Company company1 = new Company(102,"Rajesh");
    }

}