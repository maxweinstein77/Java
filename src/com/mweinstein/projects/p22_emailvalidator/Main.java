package com.mweinstein.projects.p22_emailvalidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Email:");
        String email = scanner.nextLine();

        boolean containsAt = email.contains("@");
        boolean endsWithDotCom = email.endsWith(".com");
        boolean validEmailLength = email.length() > 7;

        boolean isValidEmail = containsAt && endsWithDotCom && validEmailLength;

        if (isValidEmail) {
            System.out.println("Email valid!");
        } else {
            System.out.println("Email invalid:");

            if (!containsAt) {
                System.out.println("- must contain @");
            }

            if (!endsWithDotCom) {
                System.out.println("- must end with .com");
            }

            if (!validEmailLength) {
                System.out.println("- must be at least 7 characters long");
            }
        }
    }
}