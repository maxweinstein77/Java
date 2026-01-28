package com.mweinstein.projects.p103_divisionwithexception;

import java.util.Scanner;

public class DivisionWithException {
    public static void division(float numerator, float denominator) {
        if (denominator == 0) {
            System.out.println("Can not divide by 0!");
            return;
        }

        System.out.println("" + numerator +
                " / " +
                denominator +
                " = "  +
                (1.0 * numerator / denominator));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numerator: ");
        float numerator = scanner.nextFloat();

        System.out.println("Denominator: ");
        float denominator = scanner.nextFloat();

        division(numerator, denominator);
    }
}
