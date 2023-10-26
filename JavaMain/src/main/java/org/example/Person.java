package org.example;

import java.util.Scanner;

class Person {
    private String name;
    private int birthYear;


    public Person() {
    }


    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age() {
        int currentYear = 2020;
        return currentYear - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter birth year: ");
        birthYear = scanner.nextInt();
    }


    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + age() + " years");
    }

    public void changeName(String newName) {
        name = newName;
    }
}