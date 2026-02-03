package com.mweinstein.projects.p109_caseinsensitivecomparator;

import java.util.Comparator;

public class CaseInsensitiveComparator {
    Comparator<String> caseInsensitive = new Comparator<String>() {

        @Override
        public int compare(String a, String b) {
            return a.toLowerCase().compareTo(b.toLowerCase());
        }
    };

    public static void main(String[] args) {
        CaseInsensitiveComparator c = new CaseInsensitiveComparator();

        System.out.println(c.caseInsensitive.compare("apple", "Banana"));
    }
}