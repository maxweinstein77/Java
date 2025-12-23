package com.mweinstein.projects.p23_coursegradeanalyzer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char[] grades = {'A', 'B', 'A', 'C', 'D', 'B', 'A', 'C', 'A', 'A'};
        int gradeA = countOccurrences(grades, 'A');
        int gradeB = countOccurrences(grades, 'B');
        int gradeC = countOccurrences(grades, 'C');
        int gradeD = countOccurrences(grades, 'D');
        System.out.println(
                "Grade Distribution:" +
                        "\nA: " + gradeA +
                        "\nB: " + gradeB +
                        "\nC: " + gradeC +
                        "\nD: " + gradeD
        );

        Arrays.sort(grades);
        char medianGrade = grades[grades.length / 2];
        System.out.println("Your final course grade was: " + medianGrade);
    }

    public static int countOccurrences(char[] grades, char targetGrade) {
        int count = 0;
        for (char grade : grades) {
            if (grade == targetGrade) {
                count++;
            }
        }
        return count;
    }
}