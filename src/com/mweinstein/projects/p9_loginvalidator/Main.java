package com.mweinstein.projects.p9_loginvalidator;

import java.util.Scanner;

public class Main {
    static final int MINIMUM_USERNAME_LENGTH = 3;
    static final int MAXIMUM_USERNAME_LENGTH = 15;
    static final int MINIMUM_PASSWORD_LENGTH = 8;
    static final int MAXIMUM_PASSWORD_LENGTH = 32;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: ");
        String username = scanner.nextLine();
        boolean usernameLengthSatisfied =
                username.length() >= MINIMUM_USERNAME_LENGTH &&
                        username.length() <= MAXIMUM_USERNAME_LENGTH;

        if (!usernameLengthSatisfied) {
            System.out.println(
                    "Your username must be between " +
                            MINIMUM_USERNAME_LENGTH +
                            " and " +
                            MAXIMUM_USERNAME_LENGTH +
                            " characters."
            );
        } else {
            System.out.println("Password: ");
            String password = scanner.nextLine();
            boolean passwordLengthSatisfied =
                    password.length() >= MINIMUM_PASSWORD_LENGTH &&
                            password.length() <= MAXIMUM_PASSWORD_LENGTH;

            if (!passwordLengthSatisfied) {
                System.out.println(
                        "Your password must be between " +
                                MINIMUM_PASSWORD_LENGTH +
                                " and " +
                                MAXIMUM_PASSWORD_LENGTH +
                                " characters."
                );
            } else {
                boolean passwordNotEqualUsername = !password.equals(username);

                if (!passwordNotEqualUsername) {
                    System.out.println(
                            "Your password cannot match your username!"
                    );
                } else {
                    System.out.println("Login successful!");
                }
            }
        }
    }
}