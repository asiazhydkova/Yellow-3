package org.example.homeworkcollections;

import java.util.Iterator;
import java.util.List;

public class Student {
    private  String name;
    private  int course;

    public Student(String name, int course) {
        setName(name);
        setCourse(course);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }


}
