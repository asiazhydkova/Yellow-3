package org.example.lab_02.practical_task_01;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Cat(),
                new Dog(),
                new Cat()
        };

        for (Animal animal : animals) {
            System.out.println(animal + " -> voise : " + animal.voice() + ", feed : " + animal.feed() + ";");
        }
    }
}
