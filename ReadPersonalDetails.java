package com.exampleJava;

import java.io.FileReader;
import java.io.IOException;

/**
 * Practical 25 : Program to read your personal details from myTestFile
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class ReadPersonalDetails {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("myTestFile.txt"); // Initialize object filereader

        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i); // Read file and print it into String
        }
        fileReader.close();
    }

}
