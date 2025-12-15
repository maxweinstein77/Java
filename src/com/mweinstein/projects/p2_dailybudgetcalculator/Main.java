package com.mweinstein.projects.p2_dailybudgetcalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your budget today? ");
        double dailyBudget = scanner.nextDouble();

        System.out.println("How much was breakfast? ");
        double breakfastCost = scanner.nextDouble();

        System.out.println("How much was lunch? ");
        double lunchCost = scanner.nextDouble();

        System.out.println("How much was dinner? ");
        double dinnerCost = scanner.nextDouble();

        System.out.println("How much was the snack?");
        double snackCost = scanner.nextDouble();

        System.out.println("How much was the subway?");
        double subwayCost = scanner.nextDouble();

        double dailyCost =
                breakfastCost + lunchCost + dinnerCost + snackCost + subwayCost;

        double remainingBalance = dailyBudget - dailyCost;

        boolean overspent = remainingBalance < 0;

        System.out.println("Remaining balance: " + "$" + remainingBalance);

        if (overspent == true) {
            System.out.println("You overspent!");
        } else {
            System.out.println("You stayed within budget!");
        }
    }
}