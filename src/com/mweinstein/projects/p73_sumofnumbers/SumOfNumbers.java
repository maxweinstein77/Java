package com.mweinstein.projects.p73_sumofnumbers;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if (numberFromUser == 0) {
                break;
            }

            sum += numberFromUser;
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
