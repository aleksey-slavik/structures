package com.structures.sort;

import com.structures.sort.base.SortBase;
import com.structures.sort.bubble.BubbleSort;
import com.structures.sort.bubble.OddEvenSort;
import com.structures.sort.bubble.TwoDirectionBubbleSort;
import com.structures.sort.insert.InsertSort;
import com.structures.sort.merge.MergeSort;
import com.structures.sort.select.SelectSort;

public class Demo {

    private static final int LOW_LENGTH = 25;

    private static final int LOW_BOUND = 10;

    private static final int BIG_LENGTH = 10000;

    private static final int BIG_BOUND = 100;

    public static void main(String[] args) {
        System.out.println("Bubble sort:");
        printResults(new BubbleSort());

        System.out.println("Two direction bubble sort:");
        printResults(new TwoDirectionBubbleSort());

        System.out.println("Odd even sort:");
        printResults(new OddEvenSort());

        System.out.println("Select sort:");
        printResults(new SelectSort());

        System.out.println("Insert sort:");
        printResults(new InsertSort());

        System.out.println("Merge sort:");
        printResults(new MergeSort());
    }

    private static void printResults(SortBase sort) {
        System.out.println("Initial array:");
        sort.generate(LOW_LENGTH, LOW_BOUND);
        sort.print();
        System.out.println("Array after sorting:");
        sort.sort();
        sort.print();
        System.out.println("Median: " + sort.median());
        System.out.println("Remove dublicates:");
        sort.removeDuplicates();
        sort.print();
        System.out.println("Sorting random big array:");
        sort.generate(BIG_LENGTH, BIG_BOUND);
        sort.sort();
        System.out.println("Time: " + sort.getTime() + " ms");
        System.out.println("Comparisons: " + sort.getComparison());
        System.out.println("Assignments: " + sort.getAssignment());
        System.out.println("Sorting incremental big array: ");
        sort.generate(BIG_LENGTH, true);
        sort.sort();
        System.out.println("Time: " + sort.getTime() + " ms");
        System.out.println("Comparisons: " + sort.getComparison());
        System.out.println("Assignments: " + sort.getAssignment());
        System.out.println("Sorting decreasing big array: ");
        sort.generate(BIG_LENGTH, false);
        sort.sort();
        System.out.println("Time: " + sort.getTime() + " ms");
        System.out.println("Comparisons: " + sort.getComparison());
        System.out.println("Assignments: " + sort.getAssignment());
        System.out.println("--------------------------------------------------");
    }
}
