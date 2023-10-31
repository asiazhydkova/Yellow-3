package org.example.Task1;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author mykhailo_romaniv
 * @version 0.1
 * @since 31-10-2023
 */
public class Person {

    private String name;
    private int birthYear;

    /**
     *
     * @return name of person
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name to set Name person.
     */
    public void setName(String name ){
        this.name=name;
     }

    /**
     *
     * @return birthYear of person
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     *
     * @param birthYear to set birthYear to the person.
     */
    public void setBirthYear(int birthYear ){
        this.birthYear=birthYear;
    }

    /**
     * Default constructor
     */
    public Person(){}

    /**
     * Constructor with 2 variables (Name, birthYear)
     * @param name to set Name.
     * @param birthYear to Set birthYear
     */
    public Person(String name,int birthYear){
        setName(name);
        setBirthYear(birthYear);
    }

    /**
     *
     * @return age person
     */
    public int calculateAge(){
        return Calendar.getInstance().get(Calendar.YEAR)-birthYear;
    }

    /**
     * to Input data of the person
     */
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = scanner.nextLine();
        System.out.print("Enter the birth year: ");
        birthYear = scanner.nextInt();
    }

    /**
     * Output data of the person
     */
    public void output(){
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
    }

    /**
     *
     * @param newName set new name to the person.
     */
    public void changeName(String newName) {
        setName(newName);
    }
}
