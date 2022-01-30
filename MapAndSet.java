package com.exampleJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Practical 21 : Program using Map Concept
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
public class MapAndSet {

    public static void main(String[] args) {
        HashMap < String, Integer > person = new HashMap < String, Integer > (); // HashMap in String, Integer format
        person.put("Jackson", 20); // Declare Name and Age of Person
        person.put("James", 23);
        person.put("Alex", 26);
        person.put("John", 23);
        System.out.println(person);

        HashSet < String > country = new HashSet < String > ();
        country.add("India");
        country.add("Canada");
        country.add("Australia");
        country.add("Europe");
        System.out.println(country);
    }

}