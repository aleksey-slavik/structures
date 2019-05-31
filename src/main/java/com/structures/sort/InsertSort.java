package com.structures.sort;

import com.structures.sort.base.SortBase;

public class InsertSort extends SortBase {

    protected void sortArray() {
        for (int out = 1; out < length; out++) {
            int temp = array[out];
            int in = out;

            while (in > 0 && array[in - 1] >= temp) {
                array[in] =  array[in - 1];
                in--;
            }

            array[in] = temp;
        }
    }
}
