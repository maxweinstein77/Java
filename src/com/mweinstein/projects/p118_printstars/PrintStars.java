package com.mweinstein.projects.p118_printstars;

import java.util.Scanner;

public class PrintStars {
    public static void printStars(int beginning, int end) {
        while (beginning < end) {
            System.out.println("*");
            beginning++;
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Beginning: ");
        int beginning = userInput.nextInt();

        System.out.println("End: ");
        int end = userInput.nextInt();

        printStars(beginning, end);
    }
}