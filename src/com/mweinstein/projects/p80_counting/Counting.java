package com.mweinstein.projects.p80_counting;

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number do you want to count to? ");
        int userInput = scanner.nextInt();

        for (int i = 1; i <= userInput; i++) {
            System.out.println(i);
        }
    }
}
