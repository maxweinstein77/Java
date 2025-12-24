package com.mweinstein.projects.p25_passporttracker;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Passport caPassport = new Passport(
                "1234",
                "Canada",
                LocalDate.of(2026, 1, 1));

        Passport ukPassport = new Passport(
                "2468",
                "England (UK)",
                LocalDate.of(2028, 1, 1));

        Passport usPassport = new Passport(
                "1357",
                "USA",
                LocalDate.of(2030, 1, 1));

        System.out.println("Passport 1:");
        System.out.println("Number: " + caPassport.number);
        System.out.println("Country: " + caPassport.country);
        System.out.println("Expiration Date: " + caPassport.expirationDate);
        System.out.println();

        System.out.println("Passport 2:");
        System.out.println("Number: " + ukPassport.number);
        System.out.println("Country: " + ukPassport.country);
        System.out.println("Expiration Date: " + ukPassport.expirationDate);
        System.out.println();

        System.out.println("Passport 3:");
        System.out.println("Number: " + usPassport.number);
        System.out.println("Country: " + usPassport.country);
        System.out.println("Expiration Date: " + usPassport.expirationDate);
        System.out.println();
    }

    static class Passport {
        String number;
        String country;
        LocalDate expirationDate;

        Passport(String number,
                 String country,
                 LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expirationDate = expiryDate;
        }
    }
}