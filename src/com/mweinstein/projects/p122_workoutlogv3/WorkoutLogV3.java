package com.mweinstein.projects.p122_workoutlogv3;

import java.util.Scanner;

public class WorkoutLogV3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Exercise name: ");
        String exercise = input.nextLine();

        System.out.print("Number of sets: ");
        int sets = input.nextInt();

        int[] reps = new int[sets];
        double[] weights = new double[sets];

        int totalReps = 0;

        for (int i = 0; i < sets; i++) {
            System.out.println("\nSet " + (i + 1) + ":");

            System.out.println("Reps: ");
            reps[i] = input.nextInt();

            System.out.println("Weight (lbs): ");
            weights[i] = input.nextDouble();

            totalReps += reps[i];
        }

        System.out.println("\nWorkout Summary: ");
        System.out.println("Exercise: " + exercise);
        System.out.println("Total Sets: " + sets);
        System.out.println("Total Reps: " + totalReps);
        System.out.println();

        for (int i = 0; i < sets; i++) {
            System.out.println("Set " + (i + 1) + ": " + weights[i] + " lbs " +
                    "for " + reps[i] + " reps");
        }

        input.close();
    }
}