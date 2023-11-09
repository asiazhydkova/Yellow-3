package org.example.lab_01;

public class Main {
    public static void main(String[] args) {

        mainPerson();

        System.out.println("-----------------------------------------------------");

        //mainStudents();

        System.out.println("-----------------------------------------------------");

        //mainEmployee();
    }

    private static void mainPerson() {
        Person pr1 = new Person("Artem", 2000);
        Person pr2 = new Person("Mark", 1996);
        Person pr3 = new Person("Oleksa", 1992);
        Person pr4 = new Person("Oleksandr", 1992);
        Person pr5 = new Person("Stepan", 1992);

        pr1.output();
        pr2.output();
        pr3.output();
        pr4.output();
        pr5.output();

        System.out.println(pr1.age());

        //pr1.input();
        //pr1.output();

    }

    private static void mainEmployee() {

        Employee em1 = new Employee("Grigoriu", 2000, 10);
        Employee em2 = new Employee("Pavlovuch", 4000, 12);
        Employee em3 = new Employee("Olegovich", 6000, 23);

        int totalSalary = em1.getSalary() + em2.getSalary() + em3.getSalary();

        System.out.println("Total Salary of all workers : " + totalSalary);
    }

    private static void mainStudents() {
        Student st1 = new Student("Vasya");
        st1.setRating(5);

        Student st2 = new Student("Vlad");
        st1.setRating(7);

        Student st3 = new Student("Kolya");
        st1.setRating(10);

        System.out.println(st1.betterStudent(st2));
        System.out.println(Student.getAvgRating());
    }

}