package org.example.lab_01;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static int totalSum;

    public Employee() {
    }

    public Employee(String name, int rate) {
        if (name.isBlank() || name.isEmpty()) throw new IllegalArgumentException();
        if (rate < 0) throw new IllegalArgumentException();

        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        if (name.isBlank() || name.isEmpty()) throw new IllegalArgumentException();
        if (rate < 0) throw new IllegalArgumentException();
        if (hours < 0 || hours > 24) throw new IllegalArgumentException();

        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public int getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return rate * hours * 0.1;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
