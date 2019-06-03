package com.structures.queue;

public class QueueWithCounter<T> implements QueueBase<T> {

    private int maxSize;

    private int size;

    private int front;

    private int rear;

    private T[] queue;

    public QueueWithCounter(int maxSize) {
        this.maxSize = maxSize;
        size = 0;
        front = 0;
        rear = -1;
        queue = (T[]) new Object[maxSize];
    }

    public void insert(T value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }

        queue[++rear] = value;
        size++;
    }

    public T remove() {
        T value = queue[front++];

        if (front == maxSize) {
            front = 0;
        }

        size--;
        return value;
    }

    public T peek() {
        return queue[front];
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
