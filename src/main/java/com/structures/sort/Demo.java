package com.structures.sort;

import com.structures.sort.base.SortBase;

public class Demo {

    private static final int LOW_LENGTH = 25;

    private static final int LOW_BOUND = 10;

    private static final int BIG_LENGTH = 10000;

    private static final int BIG_BOUND = 100;

    public static void main(String[] args) {
        System.out.println("Bubble sort:");
        printResults(new BubbleSort());

        System.out.println("Select sort:");
        printResults(new SelectSort());

        System.out.println("Insert sort:");
        printResults(new InsertSort());
    }

    private static void printResults(SortBase sort) {
        System.out.println("Initial array:");
        sort.generate(LOW_LENGTH, LOW_BOUND);
        sort.print();
        System.out.println("Array after sorting:");
        sort.sort();
        sort.print();
        System.out.println("Sorting big array:");
        sort.generate(BIG_LENGTH, BIG_BOUND);
        sort.sort();
        System.out.println("Time to sort: " + sort.getTime() + " ms");
        System.out.println("--------------------------------------------------");
    }
}
