package com.asjaHas.qamp.oophomework3.Task2;

public class ElectricEngine extends Engine {
    public ElectricEngine(final double capacity) {
        super(capacity);
    }

    public double brake(final double brakeSpeed) {
        this.capacity += 0.1 * brakeSpeed;
        return capacity;
    }

    @Override
    public double consumeCapacity(final double speed) {
        this.capacity -= 0.4 * speed;
        return capacity;
    }
}
