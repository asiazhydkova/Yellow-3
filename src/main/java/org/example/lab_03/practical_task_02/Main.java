package org.example.lab_03.practical_task_02;

import org.w3c.dom.ls.LSInput;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,String> employeeMap = new HashMap<>();

        employeeMap.put(0,"Ivan");
        employeeMap.put(1,"Stepan");
        employeeMap.put(2,"Slava");
        employeeMap.put(3,"Andriy");
        employeeMap.put(4,"Alex");
        employeeMap.put(5,"Tom");
        employeeMap.put(6,"Petro");

        System.out.println(employeeMap);

        System.out.print("Enter ID : ");
        int id = scanner.nextInt();

        if (employeeMap.containsKey(id)){
            System.out.println("Result name = " + employeeMap.get(id));
        } else {
            System.out.println("Can't find ID : " + id);
        }

        System.out.println("----------------------------------------------------");

        System.out.print("Enter name : ");
        String name = scanner.next();

        if (employeeMap.containsValue(name)){
            for (Map.Entry<Integer,String> entry:employeeMap.entrySet()) {
                if (Objects.equals(entry.getValue(), name)){
                    System.out.println("Result id = " +entry.getKey());
                }
            }
        } else {
            System.out.println("Can't find name : " + name);
        }
    }
}
