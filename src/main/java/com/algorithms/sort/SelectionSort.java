package com.algorithms.sort;

public class SelectionSort {

    /**
     * Best case = O(n²)
     * Worst case = O(n²)
     *
     * @param data
     */
    public void sort(final char[] data) {
        for (int i = 0; i < data.length; i ++) {
            int min = i;
            for (int j = (i + 1); j < data.length; j ++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            if (data[i] != data[min]) {
                char item = data[i];
                data[i] = data[min];
                data[min] = item;
            }
        }
    }
}
