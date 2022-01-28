package com.exampleJava;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Practical 20 : Program to add string values in the list and print all the values using an iterator
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class Collection {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // Object of list
        list.add("Hello"); // Add the values
        list.add("World"); // Add the values
        list.add("Mitul"); // Add the values
        Iterator<String> iterator = list.iterator(); // Iterator for print out
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }

}
