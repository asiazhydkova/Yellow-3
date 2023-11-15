package org.example.homeworkcollections;

import java.util.Comparator;
import java.util.List;

public class StudentSorter {

    public static void sortStudents(List<Student> students, Comparator<Student> comparator) {
        students.sort(comparator);
    }
}
