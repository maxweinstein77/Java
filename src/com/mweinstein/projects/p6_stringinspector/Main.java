package com.mweinstein.projects.p6_stringinspector;

public class Main {

    public static void main(String args[]) {
        String nameOne = "Max";
        System.out.println(nameOne);
        System.out.println(nameOne.toUpperCase());
        System.out.println(nameOne.toLowerCase());
        System.out.println(nameOne.charAt(0));
        System.out.println(nameOne.charAt(1));

        String nameTwo = "Maxwell";
        System.out.println(nameTwo.contains(nameOne));
        System.out.println(nameTwo.equals(nameOne));
    }
}