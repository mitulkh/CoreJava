package com.exampleJava;
import java.util.Scanner;

/**
 * Practical 8 : program to make EMI Calculator in java
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class EmiCalculator {

    public static void main(String[] args) {
        System.out.println("Enter amount:");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextFloat();
        System.out.println("Enter rate:");
        double rate = scanner.nextFloat();
        System.out.println("Enter time:");
        double time = scanner.nextFloat();

        rate = rate / (12 * 100); // One month Interest
        time = time * 12; // One month period
        double emi = (amount * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1); // Calculate emi based on amount,rate and time
        System.out.println("Monthly EMI is " + emi);
    }

}
