package com.asjaHas.qamp.oophomework3.Task1;

public class Employee extends Person {
    private final double annualSalary;
    private final String insuranceNum;

    public Employee(final double annualSalary, final String insuranceNum, final String name) {
        super(name);
        this.annualSalary = annualSalary;
        this.insuranceNum = insuranceNum;
    }

    @Override
    public String toString() {
        return super.toString() + " , salary: " + annualSalary + " , insurance number: " + insuranceNum;
    }
}
