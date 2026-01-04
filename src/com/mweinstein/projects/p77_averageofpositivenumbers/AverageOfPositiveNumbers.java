package com.mweinstein.projects.p77_averageofpositivenumbers;

import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfPositiveNumbers = 0;
        double cumulativePositiveSum = 0;

        while (true) {
            double userInput = Double.valueOf(scanner.nextDouble());

            if (userInput == 0) {
                break;
            }

            if (userInput > 0) {
                numberOfPositiveNumbers += 1;
                cumulativePositiveSum += userInput;
            }
        }

        double average = cumulativePositiveSum / numberOfPositiveNumbers;
        System.out.println(average);
    }
}