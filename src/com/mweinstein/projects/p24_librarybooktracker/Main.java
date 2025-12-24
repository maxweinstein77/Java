package com.mweinstein.projects.p24_librarybooktracker;

public class Main {

    public static void main(String[] args) {
        Book bookOne = new Book(
                "The Lord of the Rings",
                "J.R.R. Tolkien",
                true);

        Book bookTwo = new Book(
                "The Republic",
                "Plato",
                true);

        Book bookThree = new Book(
                "The Iliad",
                "Homer",
                false);

        System.out.println("Book 1:");
        System.out.println("Title: " + bookOne.title);
        System.out.println("Author: " + bookOne.author);
        System.out.println("Checked out: " + bookOne.isCheckedOut);
        System.out.println();

        System.out.println("Book 2:");
        System.out.println("Title: " + bookTwo.title);
        System.out.println("Author: " + bookTwo.author);
        System.out.println("Checked out: " + bookTwo.isCheckedOut);
        System.out.println();

        System.out.println("Book 3:");
        System.out.println("Title: " + bookThree.title);
        System.out.println("Author: " + bookThree.author);
        System.out.println("Checked Out: " + bookThree.isCheckedOut);
        System.out.println();
    }

    static class Book {
        String title;
        String author;
        boolean isCheckedOut;

        Book(String title,
             String author,
             boolean isCheckedOut) {
            this.title = title;
            this.author = author;
            this.isCheckedOut = isCheckedOut;
        }
    }
}