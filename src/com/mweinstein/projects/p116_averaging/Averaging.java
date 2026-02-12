package com.mweinstein.projects.p116_averaging;

import java.util.Scanner;

public class Averaging {
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3,
                                 int number4) {
        return sum(number1, number2, number3, number4) / 4.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First: ");
        int first = scanner.nextInt();

        System.out.println("Second: ");
        int second = scanner.nextInt();

        System.out.println("Third: ");
        int third = scanner.nextInt();

        System.out.println("Fourth: ");
        int fourth = scanner.nextInt();

        double result = average(first, second, third, fourth);
        System.out.println("Average: " + result);
    }
}