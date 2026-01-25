package com.mweinstein.projects.p101_tacomethod;

public class TacoMethod {
    public static String wordTaco() { return "taco"; }

    public static void main(String[] args) {
        String taco = wordTaco();

        System.out.println("The method returned the string: " + wordTaco());
    }
}
