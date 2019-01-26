package com.algorithms.sort;

public class MergeSort {

    /**
     * Best case = O(n log n)
     * Worst case = O(n log n)
     *
     * @param data
     */
    public void sort(final char[] data) {
        if (data != null) {
            sort(data, 0, data.length - 1);
        }
    }

    private void sort(final char[] data, final int l, final int r) {
        if (l < r) {
            int m = (l + r) / 2;
            int i = 0;
            int iL = l;
            int iR = m + 1;

            sort(data, iL, m);
            sort(data, iR, r);

            char[] temp = new char[r - l + 1];

            while (iL <= m && iR <= r) {
                if (data[iL] < data[iR]) {
                    temp[i++] = data[iL++];
                } else {
                    temp[i++] = data[iR++];
                }
            }

            while (iL <= m) {
                temp[i++] = data[iL++];
            }

            while (iR <= r) {
                temp[i++] = data[iR++];
            }

            for (int j = l; j <= r; j++) {
                data[j] = temp[j - l];
            }
        }
    }
}
