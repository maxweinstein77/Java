package com.mweinstein.projects.p68_arewethereyet;

import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give me a number:");
            int input = scanner.nextInt();
            if (input == 4) {
                break;
            }
        }
    }
}