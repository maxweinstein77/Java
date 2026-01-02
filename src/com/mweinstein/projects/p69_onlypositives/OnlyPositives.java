package com.mweinstein.projects.p69_onlypositives;

import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            if (numberFromUser < 0) {
                System.out.println("Unsuitable number");
                continue;
            }

            if (numberFromUser == 0) {
                break;
            }

            System.out.println(numberFromUser * numberFromUser);
        }
    }
}