package org.example.lab_03.homework_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Andriy", 1));
        list.add(new Student("Marta", 2));
        list.add(new Student("Olga", 3));
        list.add(new Student("Anatoliy", 4));
        list.add(new Student("Mykola", 2));
        list.add(new Student("Petro", 3));
        list.add(new Student("Ivan", 3));
        list.add(new Student("Samson", 3));

        //Print Original list
        System.out.println("---------------------Original list--------------------");
        printStudentsList(list);

        //Print Students list
        System.out.println("---------------------Students list--------------------");
        List<Student> newList = Student.printStudents(list, 3);
        printStudentsList(newList);

        System.out.println("---------------------Sort by Name--------------------");
        Collections.sort(list, new Student.compareByName());
        printStudentsList(list);

        System.out.println("---------------------Sort by Course--------------------");
        Collections.sort(list, new Student.compareByCourse());
        printStudentsList(list);

    }

    static void printStudentsList(List<Student> list) {
        Iterator iterator = list.iterator();
        System.out.println("Name \t Course");
        while (iterator.hasNext()) {
            Student stud = (Student) iterator.next();
            System.out.println(stud.getName() + ",\t\t" + stud.getCourse());
        }
    }
}
