package com.exampleJava;

/**
 * Practical 15 : Hybrid Inheritance
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
interface read {

    public void reading();

}

interface work {

    public void working();

}

class JuniorWorker implements read, work {

    String firstName;
    String lastName;
    int age;

    public void reading() {
        System.out.println("Learner is reading.");
    }

    public void working() {
        System.out.println("Learner is working.");
    }

}

class HourlyJuniorWorker extends JuniorWorker {

    int salary = 5000; // Salary per hour
    int hoursWorked;

    public int computePay() {
        return salary * hoursWorked;
    }

}

public class HybridDemo {

    public static void main(String[] args) {
        HourlyJuniorWorker emp = new HourlyJuniorWorker();
        emp.hoursWorked = 10;
        emp.firstName = "Ramesh";
        emp.lastName = "Patel";
        emp.age = 27;
        System.out.println(emp.computePay()); // Calculate Payment of Hourly-based Worker
    }

}
