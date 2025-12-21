package com.mweinstein.projects.p15_countdowntimer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of seconds to countdown from: ");
        int startingAmount = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int remainingAmount = startingAmount;

            @Override
            public void run() {
                System.out.println(remainingAmount);
                remainingAmount--;

                if (remainingAmount < 0) {
                    System.out.println("TIME'S UP!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}