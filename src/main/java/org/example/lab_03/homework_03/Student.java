package org.example.lab_03.homework_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static List<Student> printStudents(List students, Integer course) {
        List<Student> resultList = new ArrayList<>();
        Iterator iterator = students.iterator();
        while (iterator.hasNext()) {
            Student stud = (Student) iterator.next();
            if (stud.getCourse() == course) {
                resultList.add(stud);
            }
        }
        return resultList;
    }

    public static class compareByName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class compareByCourse implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse() - o2.getCourse();
        }
    }
}
