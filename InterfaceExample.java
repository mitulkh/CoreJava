package com.exampleJava;

/**
 * Practical 17 : Program to demonstrate Interface
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
interface Query {

    public void raiseQuery();

}

interface Write {

    public void writing();

}

class Instructor implements Query, Write {

    public void raiseQuery() {
        System.out.println("Raise a query to Instructor");
    }

    public void writing() {
        System.out.println("Instructor is finding a solution");
    }

}

public class InterfaceExample {

    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.raiseQuery();
        instructor.writing();
    }

}
