package org.example.homeworkexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            double num1 = getUserDoubleNum("Enter the first number: ", scanner);

            double num2 = getUserDoubleNum("Enter the second number: ", scanner);

            double result = div(num1, num2);

            System.out.println("Result of division: " + result);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage() + "Invalid input. Please enter valid double numbers.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "Enter a non-zero second number.");
        }
    }
    private static double getUserDoubleNum(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public static double div(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }
}
