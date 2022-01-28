package com.exampleJava;

/**
 * Practical 6 : program to example of break/continue statement
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class NumberExample {

    public static void main(String[] args) {
        first:
        for (int i = 1; i <= 5; i++) {
            second:
            for (int j = 1; j <= 5; j++) {
                if (i == 3 && j == 3) {
                    break first; // Terminate the loop
                }
                if (i == 2 && j == 3) {
                    continue second;
                }
                System.out.println(i+" "+j);
            }
        }
    }

}