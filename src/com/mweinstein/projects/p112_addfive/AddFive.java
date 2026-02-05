package com.mweinstein.projects.p112_addfive;

public class AddFive {
    public static void addFive(int number) {
        System.out.println(number += 5);
    }

    public static void main(String[] args) {
        int number = 3;
        addFive(number);
    }
}
