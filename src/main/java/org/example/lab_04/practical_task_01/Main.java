package org.example.lab_04.practical_task_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input first number: ");
        int first = inputNum();

        System.out.println("Input second number: ");
        int second = inputNum();

        System.out.println(squareRectangle(first, second));
    }

    public static int squareRectangle(int a, int b) {
        return a * b;
    }

    public static int inputNum() {
        int num;
        try {
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
        } catch (InputMismatchException e){
            throw new InputMismatchException();
        }

        if (num < 0) throw new ArithmeticException("The value must be greater than zero");

        return num;
    }
}
