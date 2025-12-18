package com.mweinstein.projects.p11_freeshippingchecker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shippingThreshold = 75.00;

        System.out.println("What's your cart total (USD)? ");
        double cartTotal = scanner.nextDouble();

        String shippingQualifier = cartTotal >= shippingThreshold ?
                "You qualify for free shipping!" :
                "Shipping is not included.";

        System.out.println(shippingQualifier);
    }
}