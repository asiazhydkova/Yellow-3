package org.example.lab_02.homework_01;

import org.example.lab_02.homework_01.birdlist.Chicken;
import org.example.lab_02.homework_01.birdlist.Eagle;
import org.example.lab_02.homework_01.birdlist.Penguin;
import org.example.lab_02.homework_01.birdlist.Swallow;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Swallow(true, true),
                new Eagle(true, true),
                new Penguin(true, true),
                new Swallow(true, true),
                new Chicken(true, true)
        };

        for (Bird bird : birds) {
            System.out.print(bird.getClass().getSimpleName() + " : ");
            System.out.println(bird.fly());
        }
    }
}
