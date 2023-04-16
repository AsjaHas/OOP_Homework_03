package com.asjaHas.qamp.oophomework3.Task2;

public class ElectricCar extends Vehicle {
    private final ElectricEngine electricCarEngine;

    public ElectricCar(final String model, final double capacity) {
        super(model);
        this.electricCarEngine = new ElectricEngine(capacity);
    }

    @Override
    public double accelerate(final double speed) {
        if (electricCarEngine.canAccelerate(speed)) {
            this.speed += speed;
            electricCarEngine.consumeCapacity(speed);
        }
        return speed;
    }

    @Override
    public double decelerate(final double speed) {
        final double previousSpeed = this.speed;
        this.speed -= speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
        final double speedDecrease = previousSpeed - this.speed;
        electricCarEngine.brake(speedDecrease);
        return speed;
    }

    @Override
    public String toString() {
        return super.toString() + electricCarEngine.toString();
    }
}
