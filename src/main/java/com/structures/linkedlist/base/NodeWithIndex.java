package com.structures.linkedlist.base;

public class NodeWithIndex<T> extends Node<T> {

    public int index;

    public NodeWithIndex(int index, T value) {
        super(value);
        this.index = index;
    }

    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        return "[" + index + ", " + value + "]";
    }
}
