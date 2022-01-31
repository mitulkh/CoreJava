package com.exampleJava;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Practical 24 : Program to add your personal details in myTestFile
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class AddPersonalDetails {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myTestFile.txt");
            writer.write("Name : Mitul");
            writer.write("\nEmail : mitonly23@gmail.com");
            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("Personal details added successfully.");
    }

}
