package com.mweinstein.tutorials.amigoscode.javafullcourse;

public class Test {

    public static void main(String[] args) {
        // Logical operators
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isAmigoscodeMember = true;
        System.out.println(isAdult && isStudent);
        System.out.println(isAdult || isStudent);
        System.out.println((isAdult || isStudent) && isAmigoscodeMember);
        System.out.println((!isAdult || isStudent) && isAmigoscodeMember);
        System.out.println((!isAdult || isStudent) && !isAmigoscodeMember);
        System.out.println(isAdult);
        System.out.println(!isAdult);
        String name = "Mark";
        System.out.println((10 > 8 || 2 <= 2) &&
                !isAdult &&
                name.contains("M"));
    }
}