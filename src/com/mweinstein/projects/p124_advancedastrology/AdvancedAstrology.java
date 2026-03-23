package com.mweinstein.projects.p124_advancedastrology;

public class AdvancedAstrology {
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
            System.out.println();
        }
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            printSpaces(height - i - 1);
            printStars(i * 2 + 1);
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(4);
        printTriangle(8);

        christmasTree(5);
        christmasTree(10);
    }
}