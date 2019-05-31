package com.structures.sort.bubble;

import com.structures.sort.base.SortBase;

public class OddEvenSort extends SortBase {

    protected void sortArray() {
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < length && length - j > 1; j += 2) {
                    if (array[j] > array[j + 1]) {
                        swap(j, j + 1);
                    }
                    comparison++;
                }
            } else {
                for (int j = 1; j < length && length - j > 1; j += 2) {
                    if (array[j] > array[j + 1]) {
                        swap(j, j + 1);
                    }
                    comparison++;
                }
            }
        }
    }
}
