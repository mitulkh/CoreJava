package com.example_Java;

import java.util.Scanner;

/**
 * Practical 8 : program to make EMI Calculator in java
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class EmiCalculator {

    public static void main(String[] args) {
        double amount,rate,time,emi;
        System.out.println("Enter amount:");
        Scanner scanner = new Scanner(System.in);
        amount = scanner.nextFloat();
        System.out.println("Enter rate:");
        rate = scanner.nextFloat();
        System.out.println("Enter time:");
        time = scanner.nextFloat();

        rate = rate / (12 * 100);
        time = time * 12;
        emi = (amount * rate * Math.pow(1 + rate ,time)) / (Math.pow(1 + rate ,time) - 1);
        System.out.println("Monthly EMI is "+emi); // Print monthly emi
    }

}
