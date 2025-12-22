package com.mweinstein.projects.p20_hellouser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String username = scanner.nextLine();
        System.out.println("Hello " + username);
    }
}