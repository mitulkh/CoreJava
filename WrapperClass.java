package com.exampleJava;

/**
 * Practical 9 : program to compare two variables of wrapper class
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class WrapperClass {

    public static void main(String[] args) {
        int num1 = 512;
        Integer object1 = Integer.valueOf(num1);
        int num2 = 512;
        Integer object2 = Integer.valueOf(num2);
        if (object1.equals(object2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }

}
