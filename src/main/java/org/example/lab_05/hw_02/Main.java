package org.example.lab_05.hw_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Dog> dogs = createListDogs();

        //View list
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        System.out.println("--------------------------------------");

        //Check if there is no two dogs with the same name
        boolean sameName = checkSameName(dogs);
        if (sameName) {
            System.out.println("There is two dogs with the same name");
        } else {
            System.out.println("There is no two dogs with the same name");
        }

        //Display the name and the kind of the oldest dog
        Dog maxAge = getDodWithMaxAge(dogs);
        System.out.println("Oldest dog -> " + maxAge.getName() + ", Kind: " + maxAge.getBreed());

    }

    public static List<Dog> createListDogs() {
        List<Dog> dogs = new LinkedList<>();
        dogs.add(new Dog("Bella", Breed.CORGIS, 3));
        dogs.add(new Dog("Daisy", Breed.SHEPHERDS, 2));
        dogs.add(new Dog("Buddy", Breed.DOBERMAN, 1));
        dogs.add(new Dog("Charlie", Breed.BULLDOGS, 4));
        dogs.add(new Dog("Molly", Breed.BULLDOGS, 2));
        dogs.add(new Dog("Lola", Breed.BOXERS, 8));
        dogs.add(new Dog("Toby", Breed.TERRIERS, 6));
        dogs.add(new Dog("Sophie", Breed.POODLES, 4));
        dogs.add(new Dog("Sophie", Breed.POODLES, 2));

        return dogs;
    }

    public static boolean checkSameName(List<Dog> list) {
        if (list.isEmpty()) throw new NoSuchElementException("No value present");

        boolean res = false;
        int count = (int) list.stream().map(Dog::getName).distinct().count();
        if (count < list.size()) res = true;
        return res;
    }

    public static Dog getDodWithMaxAge(List<Dog> dogs) {
        if (dogs.isEmpty()) throw new NoSuchElementException("No value present");

        return dogs.stream().max(Comparator.comparingInt(Dog::getAge)).get();
    }
}
