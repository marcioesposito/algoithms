package com.algorithms.search;

public class BinarySearch {

    /**
     * Best case = O(1)
     * Worst case = O(log n)
     *
     * @param data
     * @param target
     * @return
     */
    public int search(final char[] data, final char target) {
        int min = 0;
        int max = data.length -1;

        while (max >= min) {
            int avg = (min + max) / 2;
            if (target == data[avg]) {
                return avg;
            } else if (target < data[avg]) {
                max = avg - 1;
            } else {
                min = avg + 1;
            }
        }

        return -1;
    }
}
