package com.exampleJava;

/**
 * Practical 15 : Hierarchical Inheritance
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
class Worker {

    float salary = 10000;

    void displaySalary() {
        System.out.println("The Worker Salary is " + salary);
    }

}

class TemporaryWorker extends Worker {

    double increment = 0.35;

    void incrementSalary() {
        System.out.println("The Temporary Worker implemented salary is " + (salary + (salary * increment)));
    }

}

class PermanentWorker extends Worker {

    double increment = 0.50;

    void incrementSalary() {
        System.out.println("The Permanent Worker implemented salary is " + (salary + (salary * increment)));
    }

}

public class HierarchicalDemo {

    public static void main(String[] args) {
        TemporaryWorker temporaryWorker = new TemporaryWorker();
        PermanentWorker permanentWorker = new PermanentWorker();
        temporaryWorker.displaySalary();
        temporaryWorker.incrementSalary();
        permanentWorker.displaySalary();
        permanentWorker.incrementSalary();
    }

}