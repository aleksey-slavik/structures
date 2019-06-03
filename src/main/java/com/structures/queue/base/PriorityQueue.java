package com.structures.queue.base;

public class PriorityQueue implements QueueBase<Integer> {

    private int maxSize;

    private int size;

    private int[] queue;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        size = 0;
        queue = new int[maxSize];
    }

    public void insert(Integer value) {
        if (size == 0) {
            queue[size++] = value;
        } else {
            for (int i = size - 1; i > 0; i--) {
                if (value > queue[i]) {
                    queue[i + 1] = queue[i];
                } else {
                    queue[i + 1] = value;
                    size++;
                    break;
                }
            }
        }
    }

    public Integer remove() {
        return queue[--size];
    }

    public Integer peek() {
        return queue[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public int size() {
        return size;
    }
}
