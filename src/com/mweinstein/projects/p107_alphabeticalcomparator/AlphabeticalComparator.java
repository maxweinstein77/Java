package com.mweinstein.projects.p107_alphabeticalcomparator;

import java.util.Comparator;

public class AlphabeticalComparator {
    Comparator<String> alphabetical = new Comparator<String>() {

        @Override
        public int compare(String a, String b) {
            return a.compareTo(b);
        }
    };

    public static void main(String[] args) {
        AlphabeticalComparator c = new AlphabeticalComparator();

        System.out.println(c.alphabetical.compare("apple", "banana"));
    }
}