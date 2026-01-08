package com.mweinstein.projects.p82_fromwheretowhere;

import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int userInputTo = scanner.nextInt();

        System.out.println("Where from? ");
        int userInputFrom = scanner.nextInt();

        if (userInputTo > userInputFrom) {
            for (int i = userInputFrom; i <= userInputTo; i++) {
                System.out.println(i);
            }
        }
    }
}