package com.asjaHas.qamp.oophomework3.Task2;

public class Main {
    public static void main(String[] args) {
        Vehicle motorcycle = new Vehicle("Yamaha Tracer 9 GT");
        Car ford = new Car("Ford Focus", 60);
        ElectricCar tesla = new ElectricCar("Model 3", 60);

        System.out.println(motorcycle.toString());
        System.out.println(ford.toString());
        System.out.println(tesla.toString());

        motorcycle.accelerate(60);
        ford.accelerate(60);
        tesla.accelerate(60);

        System.out.println(motorcycle.toString());
        System.out.println(ford.toString());
        System.out.println(tesla.toString());

        motorcycle.decelerate(20);
        ford.decelerate(20);
        tesla.decelerate(20);

        System.out.println(motorcycle);
        System.out.println(ford);
        System.out.println(tesla);
    }
}
