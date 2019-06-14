package com.structures.queue.base;

import com.structures.linkedlist.base.FirstLastLinkedList;

public class LinkedQueue<T> {

    private FirstLastLinkedList<T> list;

    public LinkedQueue() {
        list = new FirstLastLinkedList<T>();
    }

    public void insert(T value) {
        list.insertLast(value);
    }

    public void remove() {
        list.deleteFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
