package com.structures.sort.select;

import com.structures.sort.base.SortBase;

public class SelectSort extends SortBase {

    protected void sortArray() {
        for (int out = 0; out < length - 1; out++) {
            int min = out;

            for (int in = out + 1; in < length; in++) {
                if (array[in] < array[min]) {
                    min = in;
                    assignment++;
                }

                comparison++;
            }

            swap(out, min);
        }
    }
}
