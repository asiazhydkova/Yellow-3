package org.example.lab_02.practical_task_02;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Student("Student1"),
                new Student("Student2"),
                new Teacher("Teacher1", 30000),
                new Cleaner("Cleaner1", 20000)
        };

        System.out.println("----------------------Array created--------------------------");

        for (Person person : persons) {
            System.out.print(person.print());
            if (person instanceof Staff){
                System.out.print(", salary: " + ((Staff) person).salary);
            }
            System.out.println();
        }
    }
}
