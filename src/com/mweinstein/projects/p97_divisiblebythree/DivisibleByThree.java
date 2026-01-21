package com.mweinstein.projects.p97_divisiblebythree;

public class DivisibleByThree {
    public static void divisibleByThreeInRange(int first, int second) {
        for (int i = first; i < second; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
}