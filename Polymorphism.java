package com.exampleJava;

/**
 * Practical 16 : Program to demonstrate Compile time Polymorphism ( Method Overloading )
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
class User {

    int a = 12;
    int b = 3;
    double multiply;

    void multiply() { // Method with no parameters
        multiply = a * b;
        System.out.println("Multiplying two numbers:" + multiply);
    }

    void multiply(int a, int b) { // Method with Parameters
        multiply = a * b;
        System.out.println("Multiplying two numbers:" + multiply);
    }

}

public class Polymorphism {

    public static void main(String[] args) {
        User user = new User();
        user.multiply();
        user.multiply(3, 5);
    }

}