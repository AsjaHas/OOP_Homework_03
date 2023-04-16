package com.asjaHas.qamp.oophomework3.Task2;

public class Vehicle {
    protected double speed;
    private final String model;

    public Vehicle(final String model) {
        this.speed = 0.0;
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(final double speed) {
        this.speed = speed;
    }

    public double accelerate(final double speed) {
        this.speed += speed;
        return speed;
    }

    public double decelerate(final double speed) {
        this.speed -= speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
        return speed;
    }

    @Override
    public String toString() {
        return "vehicle: " + model + " , speed: " + speed;
    }
}
