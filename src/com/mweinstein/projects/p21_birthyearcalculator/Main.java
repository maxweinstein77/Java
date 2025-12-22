package com.mweinstein.projects.p21_birthyearcalculator;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int birthYear = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + birthYear + ".");
    }
}