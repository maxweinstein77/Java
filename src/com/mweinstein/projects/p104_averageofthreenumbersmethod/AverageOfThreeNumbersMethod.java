package com.mweinstein.projects.p104_averageofthreenumbersmethod;

import java.util.Scanner;

public class AverageOfThreeNumbersMethod {
    public static double average(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        double avg = sum / 3.0;

        return avg;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int third = scanner.nextInt();

        double averageResult = average(first, second, third);

        System.out.println("The average of the numbers: " + averageResult);
    }
}