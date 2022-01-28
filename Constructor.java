package com.example_Java;

/**
 * Practical 7 :  Example of constructor and parameterized constructor
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class Constructor {

    float sum;

    Constructor() {
        System.out.println("No argument Constructor");
    }

    Constructor(int num1, int num2) {
        sum = num1 + num2;
        System.out.println("Sum of two number:" + sum);
    }

    public static void main(String[] args) {
         new Constructor();
         new Constructor(2, 3);
    }

}
