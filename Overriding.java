package com.exampleJava;

/**
 * Practical 16 : Program to demonstrate Run time Polymorphism ( Method Overriding )
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
class Child {

    void draw() {
        System.out.println("Drawing a picture by Child");
    }

}

class Pupils extends Child {

    void draw() {
        System.out.println("Drawing a picture by Pupils");
    }

}

public class Overriding {

    public static void main(String[] args) {
        Child child = new Child();
        Pupils pupils = new Pupils();
        child.draw();
        pupils.draw();
    }

}