package org.example;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    public String name;
    public int birthYear;
    public int age;

    public Person() {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person (String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public int age() {
        return Calendar.getInstance().get(Calendar.YEAR) - this.birthYear;
    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void changeName(String changedName) {
        name = changedName;
    }
    public void setValues(String _name, int _birthYear){
        name =_name;
        birthYear=_birthYear;
    };
    public String getValues() {
        return "Name: " + name + ", Birth Year: " + birthYear;
    }
        public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        System.out.print("Enter your birth year: ");
        birthYear = scan.nextInt();
    }
    public void output(){
        System.out.println("Person`s name is: " + name);
        System.out.println("Person`s Birth Year is : " + birthYear);
    }

}

