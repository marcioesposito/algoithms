package com.algorithms.sort;

public class QuickSort {

    /**
     * Best case = O(n log n)
     * Worst case = O(n²)
     *
     * @param data
     */
    public void sort(final char[] data) {
        if (data != null) {
            sort(data, 0, data.length -1);
        }
    }

    private void sort(final char[] data, final int l, final int h) {
        if (l < h) {
            int m = partition(data, l, h);
            sort(data, l, (m - 1));
            sort(data, (m + 1), h);
        }
    }

    private int partition(final char[] data, final int l, final int h) {
        int i = l;
        for (int j = l; j < h; j ++) {
            if (data[j] <= data[h]) {
                swap(data, i++, j);
            }
        }
        swap(data, i, h);
        return i;
    }

    private void swap(final char[] data, final int l, final int h) {
        char temp = data[l];
        data[l] = data[h];
        data[h] = temp;
    }
}
