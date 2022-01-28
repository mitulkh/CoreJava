package com.exampleJava;

/**
 * Practical 14 : program to demonstrate encapsulation
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
class Student{

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class EncapTest {

    public static void main(String[] args) {
       Student student = new Student();
       student.setId(101); // Set the Id
       student.setName("Amit"); // Set the Name
       student.setAge(18); // Set the Age
       System.out.println("Id:"+ student.getId()); // Get the Id
       System.out.println("Name: "+ student.getName()); // Get the Name
       System.out.println("Age: "+ student.getAge()); // Get the Age
    }

}
