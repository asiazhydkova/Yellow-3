package org.example.lab_04.practical_task_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Plants> plants = new ArrayList<>();

        plants.add(new Plants(2, Color.RED, Type.FERNS));
        plants.add(new Plants(20, Color.GREEN, Type.CYCADS));
        plants.add(new Plants(13, Color.GREY, Type.CONIFERS));
        plants.add(new Plants(1200, Color.ORANGE, Type.GREENALGAE));
        plants.add(new Plants(787, Color.BROWN, Type.FLOWERINGPLANTS));


        for (Plants plant:plants) {
            System.out.println(plant);
        }

    }
}
