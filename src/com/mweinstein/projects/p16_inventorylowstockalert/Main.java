package com.mweinstein.projects.p16_inventorylowstockalert;

public class Main {
    static final int LOW_STOCK_THRESHOLD = 5;

    public static void main(String[] args) {
        int[] inventoryLevels = {13, 2, 44, 1, 8};

        int itemsLow = 0;

        for (int inventoryLevel : inventoryLevels) {
            System.out.println(inventoryLevel);

            if (inventoryLevel < LOW_STOCK_THRESHOLD) {
                itemsLow++;
                System.out.println("ITEM LOW!");
            }
        }

        System.out.println("Low-stock items: " + itemsLow);
    }
}