package org.example.lab_02.homework_02;

abstract class Employee implements Payable {
    public static int allEmployees = 0;
    public int employeeld;
    public String name;

    public Employee(String name) {
        if (name.isEmpty() || name.isBlank()) throw new IllegalArgumentException();
        this.name = name;
        allEmployees += 1;
        employeeld = allEmployees;
    }

    public int getEmployeeld() {
        return allEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
