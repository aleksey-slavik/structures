package com.structures.sort.merge;

import com.structures.sort.base.SortBase;

public class MergeSort extends SortBase {

    protected void sortArray() {
        int[] workSpace = new int[length];
        internalSort(workSpace, 0, length - 1);
    }

    private void internalSort(int[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int middle = (upperBound + lowerBound) / 2;
            internalSort(workSpace, lowerBound, middle);
            internalSort(workSpace, middle + 1, upperBound);
            merge(workSpace, lowerBound, middle + 1, upperBound);
        }
    }

    private void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int index = 0;
        int offset = lowPtr;
        int middle = highPtr - 1;
        int count = upperBound - offset + 1;


        while (lowPtr <= middle && highPtr <= upperBound)
            if (array[lowPtr] < array[highPtr]) {
                workSpace[index++] = array[lowPtr++];
            } else {
                workSpace[index++] = array[highPtr++];
            }

        while (lowPtr <= middle) {
            workSpace[index++] = array[lowPtr++];
        }

        while (highPtr <= upperBound) {
            workSpace[index++] = array[highPtr++];
        }

        for (int i = 0; i < count; i++) {
            array[offset + i] = workSpace[i];
        }
    }
}
