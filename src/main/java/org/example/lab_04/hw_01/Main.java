package org.example.lab_04.hw_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input first number: ");
        double first = inputNum();

        System.out.println("Input second number: ");
        double second = inputNum();


        System.out.println(div(first, second));
    }

    public static double div(double first, double second) {
        if (second == 0) throw new ArithmeticException("Second value must not be zero");
        return first / second;
    }

    public static double inputNum() {
        double number;
        try {
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextDouble();
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }

        return number;
    }

}
