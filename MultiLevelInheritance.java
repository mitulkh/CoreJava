package com.exampleJava;

/**
 * Practical 15 : Multilevel Inheritance
 * @author Mitul
 * @version 1.0
 * @since 27-01-2022
 */
class FourWheelers {

    public void vehicleType() {
        System.out.println("Vehicle Type: Car");
    }

}

class Maruti extends FourWheelers {

    public Maruti() {
        System.out.println("Class Maruti");
    }

    public void brand() {
        System.out.println("Brand: Maruti");
    }

}

class Maruti800 extends Maruti {

    public Maruti800() {
        System.out.println("Maruti Model: 800");
    }

    public void speed() {
        System.out.println("Max: 80Kmph");
    }

}

public class MultiLevelInheritance {

    public static void main(String[] args) {
        Maruti800 obj = new Maruti800();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }

}
