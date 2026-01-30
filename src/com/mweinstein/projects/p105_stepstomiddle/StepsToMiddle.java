package com.mweinstein.projects.p105_stepstomiddle;

import java.util.Scanner;

public class StepsToMiddle {
    public static void beginningToMiddle (int start, int end) {
        int middle = (start + end) / 2;
        while (start < middle) {
            System.out.println("step");
            start++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First: ");
        int first = scanner.nextInt();

        System.out.println("Second: ");
        int second = scanner.nextInt();

        beginningToMiddle(first, second);

        System.out.println(first);
    }
}