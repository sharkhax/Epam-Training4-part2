package com.drobot.task4part2.service;

public class JaggedComparator {

    public boolean areJagsEqual(int[][] jagged1, int[][] jagged2) {
        if (jagged1.length != jagged2.length) {
            return false;
        }

        boolean result = true;

        for (int i = 0; i < jagged1.length; i++) {
            if (!areLinesEqual(jagged1[i], jagged2[i])) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean areLinesEqual(int[] line1, int[] line2) {
        if (line1.length != line2.length) {
            return false;
        }

        boolean result = true;

        for (int i = 0; i < line1.length; i++) {
            if (line1[i] != line2[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
