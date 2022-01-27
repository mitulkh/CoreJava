package com.example_Java;

/**
 * Practical 6 : program to example of break/continue statement
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class NumberExample {

    public static void main(String[] args) {
        for (int i = 1;i <= 10;i++) {
            if (i > 7) {
                break; // Terminate the loop
            }
            if (i == 5) {
                continue; // Jump the statement
            }
            System.out.println(i);
        }
    }
}