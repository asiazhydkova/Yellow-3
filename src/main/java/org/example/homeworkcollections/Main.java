package org.example.homeworkcollections;

import java.util.*;


public class Main {


    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

    public static <T> Set<T> intersectOwnRealization(Set<T> set1, Set<T> set2) {
        Set<T> intersectSet = new HashSet<>();

        for (T element : set1) {
            if (set2.contains(element)) {
                intersectSet.add(element);
            }
        }
        return intersectSet;
    }

    public static <T> Set<T> unionOwnRealization(Set<T> set1, Set<T> set2) {
        Set<T> uniontSet = new HashSet<>(set1);

        for (T element : set2) {
            uniontSet.add(element);
        }
        return uniontSet;
    }

    public static void firstTask() {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(5);
        set2.add(7);
        set2.add(9);
        set2.add(10);


        System.out.println(set1);

        System.out.println(set2);

        System.out.println("Use functions:");

        Set<Integer> unionSet = union(set1, set2);
        System.out.println(unionSet);

        Set<Integer> intersectSet = intersect(set1, set2);
        System.out.println(intersectSet);


        System.out.println("Own realis:");

        Set<Integer> unionSetOwn = unionOwnRealization(set1, set2);
        System.out.println(unionSetOwn);

        Set<Integer> intersectSetOwn = intersectOwnRealization(set1, set2);
        System.out.println(intersectSetOwn);
    }

    private static void secondTask() {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Violance", "Igor");
        personMap.put("Dark", "Janna");
        personMap.put("Horible", "John");
        personMap.put("Yellow", "Andriy");
        personMap.put("Smith", "Emily");
        personMap.put("Jhones", "Jhon");
        personMap.put("Konor", "Sarah");
        personMap.put("Lewandowski", "Orest");
        personMap.put("Boris", "John");
        personMap.put("Taylor", "Orest");


        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());

        }


        System.out.println(personMap.values().stream().filter(firstName ->
                firstName.equals("Orest")).count() >= 2 ? ">= 2 Persons with n orest" : "<=2 Persons with n orest");


        personMap.values().removeIf(firstName -> firstName.equals("Orest"));


        System.out.println("Remove: Orest");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }

    }

    public static void thirdTask() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3));
        students.add(new Student("Ive", 4));
        students.add(new Student("Oleg", 3));
        students.add(new Student("David", 1));
        students.add(new Student("Ive", 2));


        System.out.println("Order by name:");


        Collections.sort(students, new NameComparator());

        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Course: " + student.getCourse());
        }


        System.out.println("Order by coruse:");

        Collections.sort(students, new CourseComparator());
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Course: " + student.getCourse());
        }


        System.out.println("Students in course 3:");
        Student.printStudents(students, 3);
    }

    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
    }


}

class Student {
    private final String name;
    private final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println("Name: " + student.getName());
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }


}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse() - o2.getCourse();
    }

}
