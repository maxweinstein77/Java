package com.mweinstein.projects.p37_doubleinput;

import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number: ");
        double number = Double.valueOf(scanner.nextLine());

        System.out.println("You gave me the number " + number);
    }
}
