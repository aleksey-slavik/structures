package com.structures.linkedlist;

public class LinkedListItem<T> {

    protected int index;

    protected T value;

    protected LinkedListItem<T> next;

    public LinkedListItem(int index, T value) {
        this.index = index;
        this.value = value;
    }

    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String toString() {
        return "[" + index + ", " + value + "]";
    }
}
