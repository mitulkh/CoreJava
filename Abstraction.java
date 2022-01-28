package com.exampleJava;

/**
 * Practical 13 : program to demonstrate data abstraction
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
abstract class Car {

    abstract void brake();

}

class Sedan extends Car {

    void brake() {
        System.out.println("Sedan is slowing down");
    }

}
public class Abstraction {

    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.brake(); // Calling brake method
    }

}
