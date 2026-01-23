package com.mweinstein.projects.p98_numberrangeprinter;

import java.util.Scanner;

public class NumberRangePrinter {
    public static void printNumbers(int min, int max) {
       for (int i = min; i <= max; i++) {
           System.out.println(i);
       }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a minimum value: ");
        int min = scanner.nextInt();

        System.out.println("Enter a maximum value: ");
        int max = scanner.nextInt();

        printNumbers(min, max);

        System.out.println("Enter a different maximum value: ");
        int maxSecond = scanner.nextInt();

        printNumbers(min, maxSecond);
    }
}