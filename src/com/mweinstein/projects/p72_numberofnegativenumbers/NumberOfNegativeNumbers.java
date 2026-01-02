package com.mweinstein.projects.p72_numberofnegativenumbers;

import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeNumbers = 0;

        while (true) {
            System.out.println("Give a number: ");
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if (numberFromUser == 0) {
                break;
            }

            if (numberFromUser < 0) {
                negativeNumbers += 1;
            }
        }

        System.out.println("Number of negative numbers: " + negativeNumbers);
    }
}