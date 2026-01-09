package com.mweinstein.projects.p83_whilefourtimesthree;

public class WhileFourTimesThree {

    public static void main(String[] args) {
        int result = 0;

        int i = 0;
        while (i < 4) {
            result += 3;
            i++;
        }

        System.out.println(result);
    }
}