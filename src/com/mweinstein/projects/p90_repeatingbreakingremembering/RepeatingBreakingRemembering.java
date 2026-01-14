package com.mweinstein.projects.p90_repeatingbreakingremembering;

import java.util.Scanner;

public class RepeatingBreakingRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberOfNumbers = 0;
        int numberOfOdds = 0;
        int numberOfEvens = 0;
        double average = 0;

        System.out.println("Give numbers: ");

        while (true) {
            int userInput = scanner.nextInt();

            if (userInput == -1) {
                break;
            }

            if (userInput % 2 == 0) {
                numberOfEvens += 1;
            } else {
                numberOfOdds += 1;
            }

            sum += userInput;
            numberOfNumbers += 1;
        }

        if (numberOfNumbers > 0) {
            average = (double) sum / numberOfNumbers;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + numberOfEvens);
        System.out.println("Odd: " + numberOfOdds);
    }
}