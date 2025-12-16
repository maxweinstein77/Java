package com.mweinstein.projects.p8_recoveryscorecalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baseScore = 100;
        double optimalSleepHours = 8;

        System.out.println("How many hours did you sleep last night?");
        double sleepHours = scanner.nextDouble();

        double sleepDeviationHours = Math.abs(sleepHours - optimalSleepHours);
        double sleepPenalty = sleepDeviationHours * 3;
        int scoreAfterSleep = baseScore - (int) sleepPenalty;

        System.out.println("How many minutes did you exercise today?");
        int exerciseMinutes = scanner.nextInt();

        double exercisePenalty = exerciseMinutes * 0.25;
        int scoreAfterExercise = scoreAfterSleep - (int) exercisePenalty;

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        double agePenalty = age * 0.25;
        int scoreAfterAge = scoreAfterExercise - (int) agePenalty;

        int recoveryScore = Math.min(Math.max(scoreAfterAge, 0), 100);
        System.out.println("Your recovery score is: " + recoveryScore);
    }
}