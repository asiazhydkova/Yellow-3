package org.example;

public class Main {
    public static void main(String[] args) {


        Person[] people = new Person[5];
        for (int i = 0; i < 5; i++) {
            people[i] = new Person();
            System.out.println("Please, enter information about person " + (i + 1) + ":");
            people[i].input();
        }


        System.out.println("\nPeople:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i + 1) + ":");
            people[i].output();
            System.out.println();
        }


            Employee[] employees = new Employee[3];
            employees[0] = new Employee("Tom", 20, 40);
            employees[1] = new Employee("Alison", 25, 45);
            employees[2] = new Employee();

            employees[2].setName("Oleg");
            employees[2].setRate(18);
            employees[2].setHours(38);


            for (int i = 0; i < 3; i++) {
                System.out.println("Employee " + (i + 1) + ":\n" + employees[i] + "\n");
            }


            System.out.println("Total sum of all Employee salaries: $" + Employee.getTotalSum());
        }

}
