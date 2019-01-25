package com.algorithms.sort;

public class BubbleSort {

    /**
     * Best case = O(n)
     * Worst case = O(n²)
     *
     * @param data
     */
    public void sort(final char[] data) {
        int length = data.length - 1;
        boolean changed;
        do {
            changed = false;
            for (int i = 0; i < length; i ++) {
                if (data[i] > data[i + 1]) {
                    char item = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = item;
                    changed = true;
                }
            }
            length--;
        } while (length > 0 && changed);
    }
}
