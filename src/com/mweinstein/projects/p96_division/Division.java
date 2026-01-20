package com.mweinstein.projects.p96_division;

public class Division {
    public static void division (int first, int second) {
        float result = (float) first / second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        division(3, 5);
    }
}