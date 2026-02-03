package com.mweinstein.projects.p108_reversealphabeticalcomparator;

import java.util.Comparator;

public class ReverseAlphabeticalComparator {
    Comparator<String> reverseAlphabetical = new Comparator<String>() {

        @Override
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    };

    public static void main(String[] args) {
        ReverseAlphabeticalComparator c = new ReverseAlphabeticalComparator();

        System.out.println(c.reverseAlphabetical.compare("apple", "banana"));
    }
}