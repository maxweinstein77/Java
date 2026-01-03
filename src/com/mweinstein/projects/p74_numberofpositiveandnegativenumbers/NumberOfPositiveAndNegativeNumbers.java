package com.mweinstein.projects.p74_numberofpositiveandnegativenumbers;

import java.util.Scanner;

public class NumberOfPositiveAndNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPositives = 0;
        int numberOfNegatives = 0;

        while (true) {
            System.out.println("Give a number: ");
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if (numberFromUser == 0) {
                break;
            }

            if (numberFromUser > 0) {
                numberOfPositives += 1;
            }

            if (numberFromUser < 0) {
                numberOfNegatives += 1;
            }
        }

        System.out.println("Positive numbers: " + numberOfPositives);
        System.out.println("Negative numbers: " + numberOfNegatives);

        if (numberOfPositives + numberOfNegatives > 0) {
            double percentageOfPositives =
                    100.0 * numberOfPositives /
                            (numberOfPositives + numberOfNegatives);
            double percentageOfNegatives =
                    100.0 * numberOfNegatives /
                            (numberOfPositives + numberOfNegatives);

            System.out.println(
                    "Percentage of positive numbers: " + percentageOfPositives
            );
            System.out.println(
                    "Percentage of negative numbers: " + percentageOfNegatives
            );
        }
    }
}