package com.mweinstein.projects.p66_counter;

public class Counter {

    public static void main(String[] args) {
        int number = 1;

        while (true) {
            System.out.println(number);
            if (number >= 5) {
                break;
            }

            number += 1;
        }

        System.out.println("Ready!");
    }
}