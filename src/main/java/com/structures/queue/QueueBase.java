package com.structures.queue;

public interface QueueBase<T> {

    void insert(T value);

    T remove();

    T peek();

    boolean isEmpty();

    boolean isFull();

    int size();
}
