package org.example.lab_01;

import java.io.IOException;
import java.time.*;
import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;

    public Person() {
    }

    public Person(String name, int birthYear) {
        if (name.isBlank() || name.isEmpty()) throw new IllegalArgumentException();
        if (birthYear < 1900 || birthYear > Year.now(Clock.systemUTC()).getValue())
            throw new IllegalArgumentException();

        this.name = name;
        this.birthYear = birthYear;
    }

    public Year age() {
        Year thisYear = Year.now(Clock.systemUTC());
        return thisYear.minusYears(birthYear);
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new name : ");
        name = scanner.next();

        if (name.isBlank() || name.isEmpty()) throw new IllegalArgumentException();

        System.out.print("Enter a new birthYear : ");
        birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}');
    }
}
