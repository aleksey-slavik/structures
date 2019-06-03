package com.structures.queue.base;

public interface QueueBase<T> {

    void insert(T value);

    T remove();

    T peek();

    boolean isEmpty();

    boolean isFull();

    int size();
}
