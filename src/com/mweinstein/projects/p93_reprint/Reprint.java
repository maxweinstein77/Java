package com.mweinstein.projects.p93_reprint;

import java.util.Scanner;

public class Reprint {
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int userInput = scanner.nextInt();

        for (int i = 0; i <= userInput; i++) {
            printText();
        }
    }
}