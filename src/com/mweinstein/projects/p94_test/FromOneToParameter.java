package com.mweinstein.projects.p94_test;

public class FromOneToParameter {
    public static void printUntilNumber(int number) {
        int i = 0;
        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        printUntilNumber(5);
    }
}
