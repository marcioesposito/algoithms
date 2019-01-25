package com.algorithms.sort;

public class InsertionSort {

    /**
     * Best case = O(n)
     * Worst case = O(n²)
     *
     * @param data
     */
    public void sort(final char[] data) {
        for (int i = 1; i < data.length; i ++) {
            char item = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > item) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = item;
        }
    }
}
