package org.collection;
import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;
    private int course;


    public Student(String name, int course){

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



    public int compareTo(Student other) {

        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(this.course, other.course);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

}
