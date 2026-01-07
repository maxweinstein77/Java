package com.mweinstein.projects.p81_countingtohundred;

import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        for (int i = userInput; i < 101; i++) {
            System.out.println(i);
        }
    }
}