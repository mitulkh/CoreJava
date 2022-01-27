package com.example_Java;


public class ExampleOfStatic {

    static {
        System.out.println("static block executed ");
    }

    static void display() {
        System.out.println("Displaying method");
    }

    public static void main(String[] args) {
        ExampleOfStatic.display();
    }

}