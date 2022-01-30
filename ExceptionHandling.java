package com.exampleJava;

/**
 * Practical 15 : Program to demonstrate try, catch and finally block
 *
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 0;
        try { // Risky Code
            float divide = number1 / number2;
            System.out.println(divide);
        } catch (ArithmeticException e) { // Handle the Exception
            System.out.println("Arithmetic Exception: / by zero occurs..");
        } finally {
            System.out.println("It is always executed."); // Exception occurs or not Finally executed
        }
    }

}