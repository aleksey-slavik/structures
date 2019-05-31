package com.structures.sort.bubble;

import com.structures.sort.base.SortBase;

public class BubbleSort extends SortBase {

    public void sortArray() {
        for (int out = length - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1);
                }

                comparison++;
            }
        }
    }
}
