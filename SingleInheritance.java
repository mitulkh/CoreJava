package com.exampleJava;

/**
 * Practical 15 : Program to demonstrate Single Inheritance
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
class Vehicle {

    void start() {
        System.out.println("Vehicle starting...");
    }

}

class Cars extends Vehicle {

    int noOfWheels = 4;

    public int getNoOfWheels() {
        return noOfWheels;
    }

}

public class SingleInheritance {

    public static void main(String[] args) {
        Cars cars = new Cars();
        cars.start();
        System.out.println(cars.getNoOfWheels());
    }

}
