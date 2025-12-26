package com.mweinstein.projects.p57_same;

import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String first = String.valueOf(scanner.nextLine());

        System.out.println("Enter the second string: ");
        String second = String.valueOf(scanner.nextLine());

        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}