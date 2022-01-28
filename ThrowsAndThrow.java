package com.exampleJava;

/**
 * Practical 15 : Program to demonstrate throws and throw keyword
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class ThrowsAndThrow {

    void validateAge() throws ArithmeticException { // Declare Exception
        int age = 19;
        if(age >= 18) {
            System.out.println("Allow to driving a car");
        } else {
            throw new ArithmeticException("Don't allow to drive");
        }
    }

    public static void main(String[] args) throws ArithmeticException { // Declare Exception

        ThrowsAndThrow exception = new ThrowsAndThrow();
        exception.validateAge();
    }

}
