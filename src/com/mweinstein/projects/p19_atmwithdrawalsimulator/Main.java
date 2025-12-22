package com.mweinstein.projects.p19_atmwithdrawalsimulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int accountBalance = 500;
        int withdrawalAmount;

        do {
            System.out.println(
                    "How much would you like to withdraw from your account?"
            );
            withdrawalAmount = scanner.nextInt();

            if (withdrawalAmount > accountBalance) {
                System.out.println("Not enough money. Try again!");
            }
        }
        while (withdrawalAmount  > accountBalance);

        accountBalance -= withdrawalAmount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: $" + accountBalance);
    }
}