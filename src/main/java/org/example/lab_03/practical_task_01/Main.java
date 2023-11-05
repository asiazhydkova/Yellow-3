package org.example.lab_03.practical_task_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>(Arrays.asList(1, 6, 9, 30, 5, 54, 8, 2, 6, 4));

        /*List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-5,30));
        }*/

        System.out.println("--------------myCollection---------------");
        System.out.println(myCollection);

        List<Integer> newCollection = myCollection.stream().filter(x -> x > 5).toList();
        System.out.println("--------------newCollection---------------");
        System.out.println(newCollection);


        myCollection.removeIf(i -> i > 20);
        System.out.println("--------------myCollection after remove---------------");
        System.out.println(myCollection);


        if (myCollection.size() > 2) myCollection.add(2, 1);
        if (myCollection.size() > 5) myCollection.add(5, -4);
        if (myCollection.size() > 8) myCollection.add(8, -3);
        System.out.println("--------------myCollection after insert elements---------------");
        for (int j = 0; j < myCollection.size(); j++) {
            System.out.println("Position – " + j + ", value of element – " + myCollection.get(j));
        }

        myCollection.sort(Comparator.comparingInt(w -> w));
        System.out.println("--------------myCollection after sort---------------");
        System.out.println(myCollection);


    }
}
