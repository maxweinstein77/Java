package com.mweinstein.projects.p120_workoutlogv1;

import java.util.Scanner;

public class WorkoutLogV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Exercise name: ");
        String exercise = input.nextLine();

        System.out.print("Number of sets: ");
        int sets = input.nextInt();

        System.out.print("Reps per set: ");
        int reps = input.nextInt();

        System.out.print("Weight used: ");
        double weight = input.nextDouble();

        System.out.println("\nWorkout Summary: ");
        System.out.println("Exercise: " + exercise);
        System.out.println("Sets: " + sets);
        System.out.println("Reps per set: " + reps);
        System.out.println("Weight: " + weight + " lbs");
    }
}
