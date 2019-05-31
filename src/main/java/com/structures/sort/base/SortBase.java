package com.structures.sort.base;

import java.util.Random;

public abstract class SortBase{

    protected int[] array;

    protected int length;

    private long time;

    private Random random = new Random();

    public void generate(int length, int bound) {
        this.length = length;
        array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(bound);
        }
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public long getTime() {
        return time;
    }

    public void sort() {
        long current = System.currentTimeMillis();
        sortArray();
        time = System.currentTimeMillis() - current;
    }

    protected abstract void sortArray();

    protected void swap(int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
