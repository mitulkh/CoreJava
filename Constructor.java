package com.example_Java;

/**
 * Practical 7 :  Example of constructor and parameterized constructor
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class Constructor {
    int num1;
    int num2;
    float sum;

    Constructor() { // No argument Constructor
        System.out.println("No argument Constructor");
    }

    Constructor(int num1, int num2) { // Parameterized Constructor
        this.num1 = num1; // This keyword points to the current class instance variable
        this.num2 = num2;
        sum = num1 + num2;
        System.out.println("Sum of two number:" + sum);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        Constructor obj1 = new Constructor(2,3);
    }

}
