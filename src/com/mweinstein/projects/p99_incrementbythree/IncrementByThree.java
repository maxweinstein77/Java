package com.mweinstein.projects.p99_incrementbythree;

public class IncrementByThree {
    public static void incrementByThree(int number) {
        System.out.println
                ("The value of the method parameter is 'number': " + number);
        number += 3;
        System.out.println
                ("The value of the method parameter 'number' is: " + number);
    }

    public static void main(String[] args) {
        int number = 1;
        System.out.println("The value of the variable 'number' in the main " +
                "program: " + number);
        incrementByThree(number);
        System.out.println(
                "The value of the variable 'number' in the main program: "
                        + number);
    }
}