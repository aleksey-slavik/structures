package com.structures.sort;

import com.structures.sort.base.SortBase;

public class TwoDirectionBubbleSort extends SortBase {

    protected void sortArray() {
        for (int right = length - 1, left = 0; right > 1 && left < length - 1; right--, left++) {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1);
                }
            }
            for (int i = right - 1; i > left; i--) {
                if (array[i - 1] > array[i]) {
                    swap(i, i - 1);
                }
            }
        }
    }
}
