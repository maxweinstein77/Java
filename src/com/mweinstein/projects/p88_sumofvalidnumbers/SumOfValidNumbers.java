package com.mweinstein.projects.p88_sumofvalidnumbers;

import java.util.Scanner;

public class SumOfValidNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write numbers,\n" +
                "negative numbers are invalid,\n" +
                "enter 0 to end the program: ");

        int sum = 0;
        int validNumbers = 0;
        int invalidNumbers = 0;

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            if (input < 0) {
                invalidNumbers += 1;
                continue;
            }

            sum += input;
            validNumbers++;
        }

        System.out.println("Sum of valid numbers: " + sum);
        System.out.println("Valid numbers: " + validNumbers);
        System.out.println("Invalid numbers: " + invalidNumbers);
    }
}
