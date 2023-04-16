package com.asjaHas.qamp.oophomework3.Task1;

public class Main {
    public static void main(String[] args) {
        final Person person = new Person("Asja Hasanovic");
        System.out.println(person.toString());

        final Employee employee = new Employee(100_000, "AB123007C", "Dzana Hasanovic");
        System.out.println(employee.toString());
    }
}
