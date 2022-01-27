package com.example_Java;
import java.util.Scanner;

/**
 * Practical 2 : program to demonstrate if/else statement
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class ValidateAge {

    public static void main(String[] args) {
        System.out.println("Enter your age: "); // Print Enter your age:
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to Vote."); // Print You are eligible to Vote.
        } else {
            System.out.println("You are not eligible to Vote!!!"); // Print You are not eligible to Vote!!!
        }
    }

}
