package org.example;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }
    public void setName(String name ){
        this.name=name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear ){
        this.birthYear=birthYear;
    }
    public Person(){}
    public Person(String name,int birthYear){
        setName(name);
        setBirthYear(birthYear);
    }
    public int calculateAge(){
        return Calendar.getInstance().get(Calendar.YEAR)-birthYear;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = scanner.nextLine();
        System.out.print("Enter the birth year: ");
        birthYear = scanner.nextInt();
    }
    public void output(){
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
    }
    public void changeName(String newName) {
        setName(newName);
    }
}
