package org.example;

class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum;


    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }


    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public Employee() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    public double getSalary() {
        return rate * hours;
    }


    public double getBonuses() {
        return 0.1 * getSalary();
    }


    public String toString() {
        return "Employee: " + name + "\nSalary: $" + getSalary() + "\nBonuses: $" + getBonuses();
    }


    public static double getTotalSum() {
        return totalSum;
    }
}
