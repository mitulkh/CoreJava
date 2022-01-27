package com.example_Java;

/**
 * Practical 4 : program to demonstrate while and do while loop
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class Loops {

    public static void main(String[] args) {
        int i = 1;
        System.out.println("Using while loop:");
        while (i <= 10) {
            System.out.println(i++);
        }
        System.out.println("Using do while loop:");
        int j = 1;
        do {
            System.out.println(j++);
        } while (j <= 10);
    }

}