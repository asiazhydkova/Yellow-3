package org.example.lab_03.hw_02;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new TreeMap<>();
        personMap.put("Melnuk", "Andriy");
        personMap.put("Shevchenko", "Taras");
        personMap.put("Petrenko", "Ivan");
        personMap.put("Konash", "Roman");
        personMap.put("Sloboda", "Taras");
        personMap.put("Kuruchenko", "Vasul");
        personMap.put("Shpetnuy", "Sergiy");
        personMap.put("Polysh", "Volodumur");
        personMap.put("Romanenko", "Kiril");
        personMap.put("Malenko", "Oleksa");


        //System.out.println(personMap);
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

        System.out.println("---------------------------------------------");

        Map<String, String> newPersonMap = new TreeMap<>();
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            newPersonMap.put(entry.getValue(), entry.getKey());
        }

        if (newPersonMap.size() < personMap.size()) {
            System.out.println("There are at less two persons with the same First Name");
        } else {
            System.out.println("There are not two persons with the same First Name");
        }

        System.out.println("---------------------------------------------");

        personMap.values().remove("Kiril");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }
}
