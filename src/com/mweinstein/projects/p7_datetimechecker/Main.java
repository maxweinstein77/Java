package com.mweinstein.projects.p7_datetimechecker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "! What would you like to know?" +
                "\nEnter" +
                "\n'W' for day of week," +
                "\n'M' for month, " +
                "\n'Y' for year," +
                "\n'D' for date," +
                "\n'T' for time," +
                "\n'A' for date and time.");

        char choice = scanner.next().charAt(0);
        char choiceFormatted = Character.toUpperCase(choice);

        LocalDate nowDate = LocalDate.now();

        String dayOfWeek = nowDate.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        String month = nowDate.getMonth()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        DateTimeFormatter dateFormatter =
                DateTimeFormatter.ofPattern ("MMM dd, yyyy");

        LocalTime nowTime = LocalTime.now();
        DateTimeFormatter timeFormatter =
                DateTimeFormatter.ofPattern("h:mm a");

        LocalDateTime nowDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("h:mm a, MMM dd, yyyy");

        if (choiceFormatted == 'W') {
            System.out.println(dayOfWeek);
        } else if (choiceFormatted == 'M') {
            System.out.println(month);
        } else if (choiceFormatted == 'Y') {
            System.out.println(nowDate.getYear());
        } else if (choiceFormatted == 'D') {
            System.out.println(nowDate.format(dateFormatter));
        } else if (choiceFormatted == 'T') {
            System.out.println(nowTime.format(timeFormatter));
        } else if (choiceFormatted == 'A') {
            System.out.println(nowDateTime.format(dateTimeFormatter));
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }
}