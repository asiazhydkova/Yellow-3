package org.example;

public class Main {

    public static void main(String[] args) {

        Person[] persons=new Person[5];
        for(int i=0;i<5;++i){
            persons[i]=new Person();
            System.out.println("Input information about person "+i);
            persons[i].input();
        }
        for(int i=0;i<5;++i){
            persons[i].output();
            System.out.println("Age: "+persons[i].calculateAge());
        }

    }
}
