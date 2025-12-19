package com.mweinstein.projects.p12_workoutselector;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What workout are you doing today? " +
                "\nEnter 'PS' for push, 'PL' for pull, or 'LG' for legs.");
        String workout = scanner.nextLine();

        switch (workout.toUpperCase()) {
            case "PS":
                System.out.println(
                        "- Military Press / Overhead Press (5 × 5)\n" +
                        "- Dumbbell Bench Press (3 × 5)\n" +
                        "- Tricep Dips (3 × 8)\n" +
                        "- Lateral Raises (3 × 8)\n" +
                        "- Lying Dumbbell Extensions (3 × 8)\n" +
                        "- Tricep Pushdowns (3 × 8)\n"
                );
                break;
            case "PL":
                System.out.println(
                        "- Pull-Ups / Lat Pulldown (5 × 5)\n" +
                        "- Bent-Over Barbell Row (3 × 5)\n" +
                        "- T-Bar Row (3 × 8)\n" +
                        "- Dumbbell Shrugs (3 × 8)\n" +
                        "- Preacher Curls (3 × 8)\n" +
                        "- Hammer Curls (3 × 8)\n"
                );
                break;
            case "LG":
                System.out.println(
                        "- Barbell Squat (5 × 5)\n" +
                        "- Deadlift (3 × 5)\n" +
                        "- Leg Press (3 × 8)\n" +
                        "- Lying Leg Curl (3 × 8)\n" +
                        "- Leg Extension (3 × 8)\n" +
                        "- Seated Calf Raise (3 × 8)\n"
                );
        }
    }
}