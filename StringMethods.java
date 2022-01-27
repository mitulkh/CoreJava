package com.example_Java;

/**
 * Practical 10 : program to make string methods like charAt(),concat(),equals() etc.
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class StringMethods {

    public static void main(String[] args) {
       String name = "James ";
       char result;
       result=name.charAt(2); // Read character
       System.out.println(result);
       String name1 = "Bond";
       System.out.println(name.concat(name1)); // Merge two string
       String name2 = "Bond";
        System.out.println(name1.equals(name2)); // Testify two strings if same string occurs, then it will give as TRUE.
    }

}
