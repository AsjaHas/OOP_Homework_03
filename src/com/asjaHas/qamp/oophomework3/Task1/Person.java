package com.asjaHas.qamp.oophomework3.Task1;

public class Person {
    private final String name;

    public Person(final String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "name: " + name;
    }
}
