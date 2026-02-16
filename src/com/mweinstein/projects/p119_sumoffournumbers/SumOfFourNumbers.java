package com.mweinstein.projects.p119_sumoffournumbers;

import java.util.Scanner;

public class SumOfFourNumbers {
    public static void start() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("First: ");
        int first = userInput.nextInt();

        System.out.println("Second: ");
        int second = userInput.nextInt();

        System.out.println("Third: ");
        int third = userInput.nextInt();

        System.out.println("Fourth: ");
        int fourth = userInput.nextInt();

        int sum = sum(first, second, third, fourth);

        System.out.println("Sum: " + sum);
    }

    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static void main(String[] args) {
        start();
    }
}