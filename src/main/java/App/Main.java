package App;

import java.util.Scanner;

class Person {
    private String name;
    private int birthYear;

    // Default constructor
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
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + age() + " years");
    }

    public void changeName(String newName) {
        this.name = newName;
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            people[i] = new Person();
            people[i].input();
        }

        for (Person person : people) {
            person.output();
        }
    }
}

