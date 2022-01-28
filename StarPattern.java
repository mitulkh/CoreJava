package com.exampleJava;

/**
 * Practical 5 : program to demonstrate star pattern using for loop
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class StarPattern {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // Loop for row
            for (int j = 0; j <= i; j++) { // Loop for column
                System.out.print("*"); // Print stars
            }
            System.out.println();
        }
    }

}
