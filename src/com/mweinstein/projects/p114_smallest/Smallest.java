package com.mweinstein.projects.p114_smallest;

import java.util.Scanner;

public class Smallest {
    public static int smallest(int number1, int number2) {
        return number1 < number2 ? number1 : number2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = in.nextInt();

        System.out.println("Enter second number: ");
        int second = in.nextInt();

        int answer = smallest(first, second);
        System.out.println("Smallest: " + answer);
    }
}