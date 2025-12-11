package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Test {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " - b = " + b);

        Person alex = new Person("Alex");
        Person miriam = alex;

        System.out.println("Before changing Alex: ");
        System.out.println(alex.name + " " + miriam.name);

        alex.name = "Alexander";

        System.out.println("After changing Alex: ");
        System.out.println(alex.name + " " + miriam.name);
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}