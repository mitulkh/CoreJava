package com.example_Java;
import java.util.Scanner;

/**
 * Practical 3 : program to demonstrate switch case.
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class SwitchCase {

    public static void main(String[] args) {
        System.out.println("Enter a number from 1 to 12:"); // Print Enter a number from 1 to 12:
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch ( choice ){
            case 1:
                System.out.println("January"); // Print January
                break;
            case 2:
                System.out.println("February"); // Print February
                break;
            case 3:
                System.out.println("March"); // Print March
                break;
            case 4:
                System.out.println("April"); // Print April
                break;
            case 5:
                System.out.println("May"); // Print May
                break;
            case 6:
                System.out.println("June"); // Print June
                break;
            case 7:
                System.out.println("July"); // Print July
                break;
            case 8:
                System.out.println("August"); // Print August
                break;
            case 9:
                System.out.println("September"); // Print September
                break;
            case 10:
                System.out.println("October"); // Print October
                break;
            case 11:
                System.out.println("November"); // Print November
                break;
            case 12:
                System.out.println("December"); // Print December
                break;
            default:
                System.out.println("Enter a valid number!!"); // Print Enter a valid number!!
        }
    }

}
