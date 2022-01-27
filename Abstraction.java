package com.example_Java;

/**
 * Practical 13 : program to demonstrate data abstraction
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
abstract class Car{ // Abstract class
    abstract void brake(); // Abstract Method
}

class Sedan extends Car{ // Subclass ( inherit from Car )
    void brake(){
        System.out.println("Sedan is slowing down");
    }
}
public  class Abstraction {

    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.brake(); // Calling brake method
    }

}
