package com.mweinstein.projects.p76_averageofnumbers;

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        double cumulativeSum = 0;

        while (true) {
            System.out.println("Give a number: ");
            double userInput = Double.valueOf(scanner.nextLine());

            if (userInput == 0) {
                break;
            }

            numberOfNumbers += 1;
            cumulativeSum += userInput;
        }

        double average = cumulativeSum / numberOfNumbers;
        System.out.println("Average of the numbers: " + average);
    }
}