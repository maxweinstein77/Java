package com.mweinstein.projects.p115_greatest;

import java.util.Scanner;

public class Greatest {
    public static int greatest(int number1, int number2, int number3) {
       return Math.max(number1, Math.max(number2, number3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First: ");
        int first = scanner.nextInt();

        System.out.println("Second: ");
        int second = scanner.nextInt();

        System.out.println("Third: ");
        int third = scanner.nextInt();

        int answer = greatest(first, second, third);
        System.out.println("Greatest: " + answer);
    }
}