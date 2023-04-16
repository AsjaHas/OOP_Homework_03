package com.asjaHas.qamp.oophomework3.Task2;

public class Car extends Vehicle {
    private final DieselEngine carEngine;

    public Car(final String model, final double capacity) {
        super(model);
        this.carEngine = new DieselEngine(capacity);
    }

    @Override
    public double accelerate(final double speed) {
        if (carEngine.canAccelerate(speed)) {
            this.speed += speed;
            carEngine.consumeCapacity(speed);

        }
        return speed;
    }

    @Override
    public String toString() {
        return super.toString() + carEngine.toString();
    }
}
