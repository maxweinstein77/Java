package com.mweinstein.projects.p106_sumoffournumbers;

import java.util.Scanner;

public class SumOfFourNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int third = scanner.nextInt();

        System.out.println("Enter the fourth number: ");
        int fourth = scanner.nextInt();

        System.out.println("The combined sum of the four numbers is " +
                sum(first, second, third, fourth));
    }

    public static int sum(int first, int second, int third, int fourth) {
        return first + second + third + fourth;
    }
}