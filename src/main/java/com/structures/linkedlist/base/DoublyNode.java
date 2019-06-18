package com.structures.linkedlist.base;

public class DoublyNode<T> {

    public T value;

    public DoublyNode<T> next;

    public DoublyNode<T> previous;

    public DoublyNode(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + value + "]";
    }
}
