package com.mweinstein.projects.p3_runningtracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much do you weigh (lbs)? ");
        double weightInPounds = scanner.nextDouble();

        System.out.println("How many miles did you run? ");
        double miles = scanner.nextDouble();

        System.out.println("How many minutes was your run? ");
        double minutes = scanner.nextDouble();

        System.out.println("How intense was your run?\n" +
                "Enter 'A' for hard, 'B' for moderate, or 'C' for easy.");
        char intensityMarker = scanner.next().charAt(0);

        String intensityLevel;
        if (Character.toUpperCase(intensityMarker) == 'A') {
            intensityLevel = "Hard";
        } else if (Character.toUpperCase(intensityMarker) == 'B') {
            intensityLevel = "Moderate";
        } else if (Character.toUpperCase(intensityMarker) == 'C') {
            intensityLevel = "Easy";
        } else {
            intensityLevel = "N/A";
        }

        double pace = minutes / miles;
        String paceFormatted = String.format("%.2f", pace);

        double caloriesBurned = miles * weightInPounds * 0.75;
        String caloriesBurnedFormatted = String.format("%.2f", caloriesBurned);

        System.out.println("Running Workout Overview" +
                "\n\nDistance: " + miles + " miles" +
                "\nTime: " + minutes + " minutes" +
                "\nPace: " + paceFormatted + " min/mile" +
                "\nCalories Burned: " + caloriesBurnedFormatted + " calories" +
                "\nIntensity: " + intensityLevel);
    }
}