package org.example.lab_02.practical_task_02;

public class Student extends Person {
    final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public String print() {
        return "I am a " + name;
    }
}
