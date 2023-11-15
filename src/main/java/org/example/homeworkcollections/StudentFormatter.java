package org.example.homeworkcollections;

import java.util.List;
import java.util.StringJoiner;

public class StudentFormatter {
    public static String getStudentsByCourse(List<Student> students, Integer course) {
        StringJoiner result = new StringJoiner("\n");

        for (Student student : students) {
            if (student.getCourse() == course) {
                result.add("Name: " + student.getName());
            }
        }

        return result.toString();
    }

    public static String getStudentsByName(List<Student> students, String name) {
        StringJoiner result = new StringJoiner("\n");

        for (Student student : students) {
            if (student.getName().equals(name)) {
                result.add("Name: " + student.getName());
            }
        }

        return result.toString();
    }

    public static String getAllStudents(List<Student> students) {
        StringJoiner result = new StringJoiner("\n");

        for (Student student : students) {

            result.add("Name: " + student.getName());

        }

        return result.toString();
    }
}
