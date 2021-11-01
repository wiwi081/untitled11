package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

    public static void main(String[] args) {
        Integer num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число");

        num1 = romanToNumber(scanner.next());
        System.out.print("Введите 2 число");
        num2 = romanToNumber(scanner.next());

        System.out.print("Выберете оператора (+, -, *, /)");
        char operator = scanner.next().charAt(0);

        scanner.close();
        int output;

        switch (operator) {
            case '+' -> output = num1 + num2;
            case '-' -> output = num1 - num2;
            case '*' -> output = num1 * num2;
            case '/' -> output = num1 / num2;
            default -> {
                System.out.println("Выберете нужный оператор");
                return;
            }
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
    }

    private static Integer romanToNumber(String roman) {
        try {
            switch (roman) {
                case "I":
                    return 1;
                case "II":
                    return 2;
                case "III":
                    return 3;
                case "IV":
                    return 4;
                case "V":
                    return 5;
                case "VI":
                    return 6;
                case "VII":
                    return 7;
                case "VIII":
                    return 8;
                case "IX":
                    return 9;
                case "X":
                    return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неверный формат данных");
        }
        return -1;
    }
}

