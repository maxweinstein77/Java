package com.mweinstein.projects.p89_diceroll;

public class DiceRoll {

    public static void main(String[] args) {
        int totalRolls = 0;
        int diceResult = 0;

        while (diceResult != 6) {
            diceResult = (int) (Math.random() * 6) + 1;
            System.out.println(diceResult);
            totalRolls += 1;
        }

        System.out.println("Total rolls: " + totalRolls);
    }
}
