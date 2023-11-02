package org.example.lab_02.practical_task_01;

public class Cat implements Animal {
    @Override
    public String voice() {
        return "Myau";
    }

    @Override
    public String feed() {
        return "Cat food";
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
