package com.example_Java;
import java.util.Scanner;

/**
 * Practical 2 : program to demonstrate the use of if/else statement. (E.g Define an 'age' variable and check your age)
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class IfElseStatementDemo {
    
    public static void main(String[] args) {
        System.out.println("Enter your age: "); // Print Enter your age:
        Scanner scanner=new Scanner(System.in); // For User Input
        int age=scanner.nextInt(); // Input a number from user

        if(age >= 18) {
            System.out.println("You are eligible to Vote."); // Print You are eligible to Vote.
        } else {
            System.out.println("You are not eligible to Vote!!!"); // Print You are not eligible to Vote!!!
        }
    }

}
