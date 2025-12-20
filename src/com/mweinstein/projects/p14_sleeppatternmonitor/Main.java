package com.mweinstein.projects.p14_sleeppatternmonitor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] sleepLog = new double[5];

        System.out.println("Enter your sleep duration (hours) for the past " +
                "five nights.");

        for (int i = 0; i < sleepLog.length; i++) {
            System.out.println("Night " + (i + 1) + ": ");
            sleepLog[i] = scanner.nextDouble();
        }

        double firstNight = sleepLog[0];
        double lastNight = sleepLog[sleepLog.length - 1];

        System.out.println(
                "Sleep Log:" +
                        "\nMonday: " + firstNight +
                        "\nLast Night: " + lastNight

        );

        if (lastNight > firstNight) {
            System.out.println("Congrats! Your sleep improved compared to " +
                    "earlier this week.");
        } else if (lastNight == firstNight) {
            System.out.println("Your sleep stayed about the same compared to " +
                    "earlier this week.");
        } else if (lastNight < firstNight) {
            System.out.println("Your sleep declined compared to earlier this " +
                    "week.");
        }
    }
}