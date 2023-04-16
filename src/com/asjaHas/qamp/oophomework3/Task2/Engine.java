package com.asjaHas.qamp.oophomework3.Task2;

public class Engine {
    protected double capacity;

    public Engine(final double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(final double capacity) {
        this.capacity = capacity;
    }

    public double increaseCapacity(final double increaseCapacity) {
        this.capacity += increaseCapacity;
        return capacity;
    }

    public double decreaseCapacity(final double decreaseCapacity) {
        this.capacity -= decreaseCapacity;
        return capacity;
    }

    public double consumeCapacity(final double speed) {
        this.capacity -= 0.2 * speed;
        return capacity;
    }

    public boolean canAccelerate(final double speed) {
        return capacity > 0.4 * speed;
    }

    @Override
    public String toString() {
        return ", capacity: " + capacity;
    }
}
