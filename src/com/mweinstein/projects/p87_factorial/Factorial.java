package com.mweinstein.projects.p87_factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int userNumber = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= userNumber; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}