package com.mweinstein.projects.p10_passwordstrengthchecker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password: ");
        String password = scanner.nextLine();

        if (password.length() < 4) {
            System.out.println("Very weak");
        } else if (password.length() <= 8) {
            System.out.println("Weak");
        } else if (password.length() <= 12) {
            System.out.println("Strong");
        } else {
            System.out.println("Excellent");
        }
    }
}