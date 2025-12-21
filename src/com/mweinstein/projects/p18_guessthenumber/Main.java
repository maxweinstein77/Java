package com.mweinstein.projects.p18_guessthenumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 7;
        int numberOfGuesses = 0;
        int guess = 0;

        System.out.println("Guess a number 1-10: ");

        while (guess != secretNumber) {
            guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess > secretNumber) {
                System.out.println("Too high! Try again: ");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again: ");
            }
        }

        System.out.println(
                "Congrats! It only took you " + numberOfGuesses + " tries."
        );
    }
}