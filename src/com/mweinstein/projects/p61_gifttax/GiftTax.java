package com.mweinstein.projects.p61_gifttax;

import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift? ");
        int giftValue = Integer.valueOf(scanner.nextLine());

        double tax;

        if (giftValue < 5_000) {
            System.out.println("No tax!");
            return;
        }

        if (giftValue <= 25_000) {
            tax = 100 + (giftValue - 5_000) * 0.08;
        } else if (giftValue <= 55_000) {
            tax = 1_700 + (giftValue - 25_000) * 0.10;
        } else if (giftValue <= 200_000) {
            tax = 4_700 + (giftValue - 55_000) * 0.12;
        } else if (giftValue <= 1_000_000) {
            tax = 22_100 + (giftValue - 200_000) * 0.15;
        } else {
            tax = 142_100 + (giftValue - 1_000_000) * 0.17;
        }

        System.out.println("Tax: " + tax);
    }
}