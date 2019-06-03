package com.structures.queue.base;

public class Queue<T> implements QueueBase<T> {

    private int size;

    private int front;

    private int rear;

    private T[] queue;

    public Queue(int size) {
        this.size = size;
        front = 0;
        rear = -1;
        queue = (T[]) new Object[size];
    }

    public void insert(T value) {
        if (rear == size - 1) {
            rear = -1;
        }

        queue[++rear] = value;
    }

    public T remove() {
        T value = queue[front++];

        if (front == size) {
            front = 0;
        }

        return value;
    }

    public T peek() {
        return queue[front];
    }

    public boolean isEmpty() {
        return rear + 1 == front || front + size - 1 == rear;
    }

    public boolean isFull() {
        return rear + 2 == front || front + size - 2 == rear;
    }

    public int size() {
        if (rear >= front) {
            return rear - front + 1;
        } else {
            return size - front + rear + 1;
        }
    }
}
