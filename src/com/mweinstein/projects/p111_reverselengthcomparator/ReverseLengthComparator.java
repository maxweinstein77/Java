package com.mweinstein.projects.p111_reverselengthcomparator;

import java.util.Comparator;

public class ReverseLengthComparator {
    Comparator<String> reverseLength = new Comparator<String>() {

        @Override
        public int compare(String a, String b) {
            return b.length() - a.length();
        }
    };

    public static void main(String[] args) {
        ReverseLengthComparator c = new ReverseLengthComparator();

        System.out.println(c.reverseLength.compare("apple", "banana"));
    }
}