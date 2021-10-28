package com.udemy.selecetionsort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfInts = new Random().ints(10, -100, 100).toArray();

        System.out.println(Arrays.toString(arrayOfInts));

        int indexOfUnsortedPartition = arrayOfInts.length - 1;
        int indexOfLargest = 0;

        for (int i = 0; i < indexOfUnsortedPartition + 1; i++) {
            if (arrayOfInts[indexOfLargest] < arrayOfInts[i]) {
                indexOfLargest = i;
            }
            if (i == indexOfUnsortedPartition) {
                swap(arrayOfInts, i, indexOfLargest);
                indexOfUnsortedPartition--;
                indexOfLargest = 0;
                i = 0;
            }
        }

        System.out.println(Arrays.toString(arrayOfInts));
    }

    private static void swap(int[] arrayOfInts, int i, int j) {
        if (i == j) {
            return;
        }
        // a=5; b=7;
        arrayOfInts[j] = arrayOfInts[j] - arrayOfInts[i]; // b = b - a = 2;
        arrayOfInts[i] = arrayOfInts[i] + arrayOfInts[j]; // a = a + b = 7;
        arrayOfInts[j] = arrayOfInts[i] - arrayOfInts[j]; // b = a - b = 5;
    }
}
