package com.mweinstein.projects.p3_runningtracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much do you weigh (lbs)? ");
        double weightInPounds = scanner.nextDouble();

        System.out.println("How many miles did you run? ");
        double durationInMiles = scanner.nextDouble();

        System.out.println("How many minutes was your run? ");
        double durationInMinutes = scanner.nextDouble();

        System.out.println("How intense was your run?\n" +
                "Type 'A' for hard, 'B' for moderate, 'C' for easy");
        char intensityMarker = scanner.next().charAt(0);
        char intensityMarkerFormatted = Character.toUpperCase(intensityMarker);

        String intensityLevel;
        if (intensityMarkerFormatted == 'A') {
            intensityLevel = "Hard";
        } else if (intensityMarkerFormatted == 'B') {
            intensityLevel = "Moderate";
        } else if (intensityMarkerFormatted == 'C') {
            intensityLevel = "Easy";
        } else {
            intensityLevel = "N/A";
        }

        double pace = durationInMinutes / durationInMiles;
        String paceFormatted = String.format("%.2f", pace);

        double caloriesBurned = (durationInMiles * weightInPounds) * 0.75;
        String caloriesBurnedFormatted = String.format("%.2f", caloriesBurned);

        System.out.println("Workout Summary" +
                "\n\nDistance: " + durationInMiles + " miles" +
                "\nTime: " + durationInMinutes + " minutes" +
                "\nPace: " + paceFormatted + " min/mile" +
                "\nCalories Burned: " + caloriesBurnedFormatted + " calories" +
                "\nIntensity: " + intensityLevel);
    }
}