package org.example;

public class Main {

    public static void main(String[] args) {

        Person[] persons=new Person[5];
        persons[0] = new Person();
        persons[0].setName("Alice");
        persons[0].setBirthYear(2000);
        persons[1] = new Person("Bob", 2001);
        persons[2] = new Person("Charlie", 2002);
        persons[3] = new Person("David", 2003);
        persons[4] = new Person("Eve", 1995);
        /*
        for(int i=0;i<5;++i){
            persons[i]=new Person();
            System.out.println("Input information about person "+i);
            persons[i].input();
        }
        */
        persons[0].changeName("Alex");
        for(Person person:persons){
            person.output();
            System.out.println("Age: "+person.calculateAge());
        }

    }
}
