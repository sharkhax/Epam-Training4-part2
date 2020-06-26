package com.drobot.task4part2.service;

public class JaggedService {

    public int[][] reflectJagged(int[][] jagged) {
        int[][] array = cloneJagged(jagged);
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            array[left] = jagged[right];
            array[right] = jagged[left];
            left++;
            right--;
        }
        return array;
    }

    public int calculateLineSum(int[] line) {
        int result = 0;

        for (int a : line) {
            result = result + a;
        }
        return result;
    }

    public int max(int[] array) {
        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    public int min(int[] array) {
        int result = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    public int[][] cloneJagged(int[][] jagged) {
        int[][] result = new int[jagged.length][];

        for (int i = 0; i < jagged.length; i++) {
            result[i] = jagged[i];
        }
        return result;
    }
}
