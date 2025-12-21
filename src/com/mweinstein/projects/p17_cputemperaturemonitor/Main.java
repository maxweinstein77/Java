package com.mweinstein.projects.p17_cputemperaturemonitor;

public class Main {
    static final int MAX_SAFE_TEMPERATURE = 90;

    public static void main(String[] args) {
        int[] cpuTemperatures = {65, 68, 75, 92, 79};

        boolean overheated = false;

        for (int cpuTemperature : cpuTemperatures) {
            System.out.println(cpuTemperature);

            if (cpuTemperature > MAX_SAFE_TEMPERATURE) {
                System.out.println("Temperature high! Shutting down system.");
                overheated = true;
                break;
            }
        }

        if (!overheated) {
            System.out.println("Temperature normal.");
        }
    }
}