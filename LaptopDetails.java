package com.exampleJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Practical 23 : Program to demonstrate comparable and comparator interface
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
class Laptop implements Comparable < Laptop > {

    private String name;
    private int price;
    private String color;

    public Laptop(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() { // Getters methods for accessing private data
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Laptop laptop) {
        return this.name.compareTo(laptop.name);
    }

}

class ComparePrice implements Comparator < Laptop > { // Class to compare Laptop by Price

    @Override
    public int compare(Laptop laptop1, Laptop laptop2) {
        if (laptop1.getPrice() == laptop2.getPrice()) {
            return 0;
        } else if (laptop1.getPrice() > laptop2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }

}

class CompareColor implements Comparator < Laptop > { // Class to compare Laptop by Color

    @Override
    public int compare(Laptop laptop1, Laptop laptop2) {
        return laptop1.getColor().compareTo(laptop2.getColor());
    }

}

public class LaptopDetails {

    public static void main(String[] args) {
        ArrayList < Laptop > list = new ArrayList < Laptop > ();
        list.add(new Laptop("Dell", 30000, "Black"));
        list.add(new Laptop("Hp", 25000, "Grey"));
        list.add(new Laptop("Asus", 27000, "White"));
        list.add(new Laptop("Acer", 26000, "Pink"));
        System.out.println("Sorted by Name :");
        Collections.sort(list); // Sorting the list by name
        for (Laptop laptop: list) {
            System.out.println(laptop.getName() + " " + laptop.getPrice() + " " + laptop.getColor());
        }

        System.out.println("\nSorted by Price :");
        ComparePrice comparePrice = new ComparePrice();
        Collections.sort(list, comparePrice); // Sorted the list by Price
        for (Laptop laptop: list) {
            System.out.println(laptop.getName() + " " + laptop.getPrice() + " " + laptop.getColor());
        }

        System.out.println("\nSorted by Color :");
        CompareColor compareColor = new CompareColor();
        Collections.sort(list, compareColor); // Sorted the list by Color
        for (Laptop laptop: list) {
            System.out.println(laptop.getName() + " " + laptop.getPrice() + " " + laptop.getColor());
        }
    }

}