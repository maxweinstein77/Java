package com.mweinstein.projects.p113_summation;

import java.util.Scanner;

public class Summation {
    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        return sum;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = userInput.nextInt();

        System.out.println("Enter second number: ");
        int second = userInput.nextInt();

        System.out.println("Enter third number: ");
        int third = userInput.nextInt();

        System.out.println("Enter fourth number: ");
        int fourth = userInput.nextInt();

        int answer = sum(first, second, third, fourth);
        System.out.println("Sum: " + answer);
    }
}