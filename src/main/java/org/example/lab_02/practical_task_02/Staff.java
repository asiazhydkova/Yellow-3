package org.example.lab_02.practical_task_02;

public abstract class Staff extends Person {
    public int salary;

    protected Staff(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public abstract int salaryM();
}
