package org.example.lab_05.hw_01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Float numbers

        System.out.println("Enter 3 float numbers : ");
        float[] flo = rangeFloat();

        for (Float number : flo) {
            if (number >= -5 && number <= 5) {
                System.out.println(number + " is in the range [-5, 5]");
            } else {
                System.out.println(number + " is not in the range [-5, 5]");
            }
        }
        System.out.println("---------------------------------------");

        //Integer numbers

        System.out.println("Enter 3 integer numbers : ");
        int[] array = maxMin();
        System.out.println("Max -> " + array[array.length - 1]);
        System.out.println("Min -> " + array[0]);
        System.out.println("---------------------------------------");

        //Error HTTP

        System.out.println("Enter HTTP error : ");
        String enumEr = errorHTTP();
        try {
            System.out.println(enumEr.substring(1) + " -> " + errorHTTP.valueOf(enumEr).getStr());
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }

    }

    private static String errorHTTP() {
        return "_" + getStrings()[0];
    }

    private static int[] maxMin() {
        String[] string = getStrings();
        return Arrays.stream(string).mapToInt(Integer::parseInt).sorted().toArray();

    }

    private static float[] rangeFloat() {
        String[] string = getStrings();
        float[] floats = new float[string.length];

        for (int i = 0; i < string.length; i++) {
            floats[i] = Float.parseFloat(string[i]);
        }
        return floats;
    }

    private static String[] getStrings() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str.split(" ");
    }
}
