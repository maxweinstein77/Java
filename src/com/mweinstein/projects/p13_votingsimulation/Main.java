package com.mweinstein.projects.p13_votingsimulation;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people are voting?");
        int peopleVoting = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the name of the first candidate?");
        String candidateOne = scanner.nextLine();

        System.out.println("What is the name of the second candidate?");
        String candidateTwo = scanner.nextLine();

        System.out.println("What is the name of the third candidate?");
        String candidateThree = scanner.nextLine();

        int[] results = new int[3];

        Random random = new Random();

        for (int i = 0; i < peopleVoting; i++) {
            int simulatedVote = random.nextInt(3);
            results[simulatedVote]++;
        }

        System.out.println("RESULTS:" +
                "\n" + candidateOne + " - " + results[0] +
                "\n" + candidateTwo + " - " + results[1] +
                "\n" + candidateThree + " - " + results[2]);

        if (results[0] == results[1]) {
            System.out.println(
                    candidateOne + " and " +
                            candidateTwo + " tied!"
            );
        } else if (results[0] == results[2]) {
            System.out.println(
                    candidateOne + " and " +
                            candidateThree + " tied!"
            );
        } else if (results[1] == results[2]) {
            System.out.println(
                    candidateTwo + " and " +
                            candidateThree + " tied!"
            );
        } else if (results[0] > results[1] && results[0] > results[2]) {
            System.out.println(candidateOne + " won!");
        } else if (results[1] > results[0] && results[1] > results[2]) {
            System.out.println(candidateTwo + " won!");
        } else if (results[2] > results[0] && results[2] > results[1]) {
            System.out.println(candidateThree + " won!");
        }
    }
}