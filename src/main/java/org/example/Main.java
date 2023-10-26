package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person Person1 = new Person();
        Person1.setValues("Alex", 1999);
        String Person1info = Person1.getValues();
        System.out.println(Person1info);
        System.out.println("Person1`s name is: " + Person1.name + ". Birth Year is: " + Person1.birthYear);

        Person Person2 = new Person();
        Person2.name = "Mila";
        Person2.birthYear = 2001;

        String Person2info = Person2.getValues();
        System.out.println("Person2`s name is: " + Person2.name + ". Birth Year is: " + Person2.birthYear);

        Person Person3 = new Person();
        Person3.name = "Robert";
        Person3.birthYear = 2003;

        Person Person4 = new Person();
        Person4.name = "Bob";
        Person4.birthYear = 2003;

        Person Person5 = new Person();
        Person5.name = "Julia";
        Person5.birthYear = 2002;
        /*System.out.println("Person1`s name is: " + Person1.name + ". Birth Year is: " + Person1.birthYear);
        System.out.println("Person2`s name is: " + Person2.name + ". Birth Year is: " + Person2.birthYear);*/
        System.out.println("Person3`s name is: " + Person3.name + ". Birth Year is: " + Person3.birthYear);
        System.out.println("Person4`s name is: " + Person4.name + ". Birth Year is: " + Person4.birthYear);
        System.out.println("Person5`s name is: " + Person5.name + ". Birth Year is: " + Person5.birthYear);
    }
}