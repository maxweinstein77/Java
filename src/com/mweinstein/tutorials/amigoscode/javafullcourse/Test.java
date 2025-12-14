package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Test {

    public static void main(String[] args) {
        // String
        char a =  'A';
        char b = 'B';

        String name = "Amigoscode"; // Name = object of str
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        String code = new String("code");
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));

        // Capital letter = class where you can create methods
    }
}