package org.example.lab_02.practical_task_01;

public class Dog implements Animal {
    @Override
    public String voice() {
        return "Wuff";
    }

    @Override
    public String feed() {
        return "Dog food";
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
