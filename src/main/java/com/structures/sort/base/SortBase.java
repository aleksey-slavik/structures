package com.structures.sort.base;

import java.util.Random;

public abstract class SortBase {

    protected int[] array;

    protected int length;

    private long time;

    private boolean isSorted = false;

    private Random random = new Random();

    public void generate(int length, int bound) {
        this.length = length;
        array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(bound);
        }
    }

    public void generate(int length, boolean direction) {
        for (int i = 0; i < length; i++) {
            if (direction) {
                array[i] = i;
            } else {
                array[i] = length - i;
            }
        }
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int median() {
        if (!isSorted) {
            sortArray();
        }
        return array[length / 2];
    }

    public void removeDuplicates() {
        if (!isSorted) {
            sortArray();
        }

        int[] temp = new int[length];
        int index = 0;
        temp[0] = array[0];

        for (int i = 0; i < length - 1; i++) {
            if (temp[index] != array[i]) {
                index++;
                temp[index] = array[i];
            }
        }

        length = index + 1;
        array = new int[length];
        System.arraycopy(temp, 0, array, 0, length);
    }

    public long getTime() {
        return time;
    }

    public void sort() {
        long current = System.currentTimeMillis();
        sortArray();
        time = System.currentTimeMillis() - current;
        isSorted = true;
    }

    protected abstract void sortArray();

    protected void swap(int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
