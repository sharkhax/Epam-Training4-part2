package com.drobot.task4part2.service;

public class SortService {

    public int[][] sortBySum(int[][] jagged) {
        JaggedService jaggedService = new JaggedService();
        int[][] array = jaggedService.cloneJagged(jagged);
        int[] buffer;
        int lineSum;
        int nextLineSum;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                lineSum = jaggedService.calculateLineSum(array[i]);
                nextLineSum = jaggedService.calculateLineSum(array[i + 1]);

                if (nextLineSum < lineSum) {
                    buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    public int[][] sortByMin(int[][] jagged) {
        JaggedService jaggedService = new JaggedService();
        int[][] array = jaggedService.cloneJagged(jagged);
        int[] buffer;
        boolean isSorted = false;
        int lineMin;
        int nextLineMin;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                lineMin = jaggedService.min(array[i]);
                nextLineMin = jaggedService.min(array[i + 1]);

                if (nextLineMin < lineMin) {
                    buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    public int[][] sortByMax(int[][] jagged) {
        JaggedService jaggedService = new JaggedService();
        int[][] array = jaggedService.cloneJagged(jagged);
        int[] buffer;
        boolean isSorted = false;
        int lineMax;
        int nextLineMax;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                lineMax = jaggedService.max(array[i]);
                nextLineMax = jaggedService.max(array[i + 1]);

                if (nextLineMax < lineMax) {
                    buffer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = buffer;
                    isSorted = false;
                }
            }
        }
        return array;
    }
}
