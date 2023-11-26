package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Olga");
        employee1.setRate(1000);
        employee1.setHour(10);
        Employee employee2 = new Employee("Denys", 1200);
        employee2.setHour(7);
        Employee employee3 = new Employee("Mymy", 1500, 15);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee1.getSalary());
        System.out.println(employee2.getSalary());
        System.out.println(employee3.getSalary());
        System.out.println("Total Sum: " + employee1.getTotalSum());
    }
}
        /*   Employee employee1 = new Employee("Oleg");
                employee1.setRating(4);
                Employee employee2 = new Employee("Anna");
                employee2.setRating(5);
                Employee employee3 = new Employee();
        employee3.setName("Mary");
        employee3.setRating(4);
                System.out.println("Out students");
                System.out.println(employee1);
                System.out.println(employee2);
                System.out.println(employee3);
                System.out.println();
        System.out.println(employee1.rating);
        System.out.println(employee2.getRating());
        System.out.println(employee3.rating);
                System.out.print("Employee 1 has better rating than employee2 ");
                System.out.println(employee1.betterEmployee(employee2));
                System.out.println();
                System.out.printf("Average rating is " + "%.2f", Employee.getAvgRating());
            }
*/
