package org.example.lab_02.practical_task_02;

public class Cleaner extends Staff {
    final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name, int salary) {
        super(name, salary);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public String print() {
        return "I am a " + name;
    }

    @Override
    public int salaryM() {
        return salary;
    }
}
