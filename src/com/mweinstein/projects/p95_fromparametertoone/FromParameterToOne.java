package com.mweinstein.projects.p95_fromparametertoone;

public class FromParameterToOne {
    public static void printFromNumberToOne(int number) {
        int i = number;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
}