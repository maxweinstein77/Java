package com.mweinstein.projects.p62_squared;

import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println(integer * integer);
    }
}