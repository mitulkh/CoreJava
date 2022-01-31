package com.exampleJava;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Practical 22 : Program to prepare the list and remove duplicate values of the list
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class RemoveDuplicateList {

    public static void main(String[] args) {
        ArrayList < String > list = new ArrayList < String > (); // Create ArrayList to add values
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("E");
        list.add("E");

        LinkedHashSet < String > removeDuplicateList = new LinkedHashSet < String > (list); // Replace ArrayList into LinkedHashSet
        System.out.println("Remove duplicate list by using LinkedHashSet :" + removeDuplicateList);

        List < String > uniqueList = list.stream().distinct().collect(Collectors.toList()); // Stream method remove duplicate values from the list
        System.out.println("Remove duplicate list by using Stream method :" + uniqueList);
    }

}