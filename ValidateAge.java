package com.exampleJava;
import java.util.Scanner;

/**
 * Practical 2 : program to demonstrate if/else statement
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class ValidateAge {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18) { // 18 or above age is eligible to vote
            System.out.println("You are eligible to Vote.");
        } else {
            System.out.println("You are not eligible to Vote!!!");
        }
    }

}
