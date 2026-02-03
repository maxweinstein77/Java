package com.mweinstein.projects.p110_lengthcomparator;

import java.util.Comparator;

public class LengthComparator {
    Comparator<String> length = new Comparator<String>() {

        @Override
        public int compare(String a, String b) {
            return a.length() - b.length();
        }
    };

    public static void main(String[] args) {
        LengthComparator c = new LengthComparator();

        System.out.println(c.length.compare("apple", "banana"));
    }
}