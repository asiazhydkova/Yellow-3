package org.collection;
import java.util.*;

import static org.collection.SetOperations.intersect;
import static org.collection.SetOperations.union;
import static org.collection.Student.printStudents;

public class Main {
    public static void main(String[] args) {





            Set<Integer> setA = new HashSet<>();
            Set<Integer> setB = new HashSet<>();
            setA.add(1);
            setA.add(2);
            setA.add(3);
            setB.add(2);
            setB.add(3);
            setB.add(4);

            Set<Integer> unionResult = union(setA, setB);
            System.out.println("Union of setA and setB: " + unionResult);


            Set<Integer> intersectionResult = intersect(setA, setB);
            System.out.println("Intersection of setA and setB: " + intersectionResult);


            Map<String, String> personMap = new HashMap<>();
            personMap.put("Smith", "John");
            personMap.put("Johnson", "Emily");
            personMap.put("Davis", "Orest");
            personMap.put("Brown", "Olivia");
            personMap.put("Wilson", "James");
            personMap.put("Clark", "Emily");
            personMap.put("Anderson", "Orest");
            personMap.put("Martinez", "Sophia");
            personMap.put("Lee", "Michael");
            personMap.put("Garcia", "Sophia");


            System.out.println("Persons in the map:");
            for (Map.Entry<String, String> entry : personMap.entrySet()) {
                System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
            }


            String targetFirstName = "Orest";
            int firstNameCount = 0;
            for (String firstName : personMap.values()) {
                if (firstName.equals(targetFirstName)) {
                    firstNameCount++;
                    if (firstNameCount >= 2) {
                        break;
                    }
                }
            }

            if (firstNameCount >= 2) {
                System.out.println("There are at least two persons with the same first name: " + targetFirstName);
            } else {
                System.out.println("There are not at least two persons with the same first name: " + targetFirstName);
            }


            personMap.values().removeIf(firstName -> firstName.equals("Orest"));
            System.out.println("Persons with the first name 'Orest' removed from the map.");


            System.out.println("Updated map after removing 'Orest':");
            for (Map.Entry<String, String> entry : personMap.entrySet()) {
                System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
            }


        List<Student> students = new ArrayList<>();


        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 1));
        students.add(new Student("David", 3));
        students.add(new Student("Eve", 2));




        System.out.println("\nList of students ordered by course:");
        students.sort((s1, s2) -> Integer.compare(s1.getCourse(), s2.getCourse()));
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }


        int targetCourse = 1;
        printStudents(students, targetCourse);

    }
}