package com.mweinstein.projects.p70_trackones;

import java.util.Scanner;

public class TrackOnes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ones = 0;

        while (true) {
            System.out.println("Give a number (end with 0): ");
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if (numberFromUser == 0) {
                break;
            }

            if (numberFromUser == 1) {
                ones += 1;
            }
        }

        System.out.println("Total of ones: " + ones);
    }
}