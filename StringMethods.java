package com.exampleJava;

/**
 * Practical 10 : program to make string methods like charAt(),concat(),equals() etc.
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class StringMethods {

    public static void main(String[] args) {
        String firstName = "James ";
        String lastName = "Bond";
        char result;
        result = firstName.charAt(2); // Read character
        System.out.println(result);
        System.out.println(firstName.concat(lastName)); // Merge two string
        System.out.println(firstName.equals(lastName)); // Testify two strings if same string occurs, then it will give as TRUE.
        System.out.println(firstName.contains("Ja")); // Checks if string contain sequence of character or not

        String name1 = "PATEL";
        String name2 = "patell";
        System.out.println(name1.compareToIgnoreCase(name2));
        System.out.println(name1.hashCode()); // Returns hashcode of string

        String name = "  Hello  ";
        System.out.println(name.trim()); // Remove whitespace from both sides of string
    }

}
