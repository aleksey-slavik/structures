package com.structures.linkedlist.base;

public class Node<T> {

    public T value;

    public Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        return "[" + value + "]";
    }
}
