package com.exampleJava;

import java.io.File;
import java.io.IOException;

/**
 * Practical 24 : Program to create a text file
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class PersonalDetails {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\brijesh\\Desktop\\myTestFile.txt"); // Initialize File Object and passing path as an argument
        try {
            if (file.createNewFile()){
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException exception) {
            System.out.println("Unable to Create File");
            exception.printStackTrace(); // PrintStackTrace used for diagnosing an exception
        }
    }

}