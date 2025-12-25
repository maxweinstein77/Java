package com.mweinstein.projects.p36_integerinput;

import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println("You gave me the number " + number);
    }
}
