package org.example.lab_04.hw_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println("---------------------------------------");
            System.out.println("Enter number № " + (i + 1) + " : ");
            System.out.println("Result -> " + readNumber(1, 100));
        }

    }

    public static int readNumber(int start, int end) {
        int result = inputNum();
        if (result < start || result > end) throw new IllegalArgumentException("Number out of bounds");
        return result;
    }

    public static int inputNum() {
        int res;
        Scanner scanner = new Scanner(System.in);
        try {
            res = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("It's not a number");
        }
        return res;
    }
}
