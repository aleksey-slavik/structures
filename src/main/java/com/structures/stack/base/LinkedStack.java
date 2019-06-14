package com.structures.stack.base;

import com.structures.linkedlist.base.LinkedList;

public class LinkedStack<T> {

    private LinkedList<T> list;

    public LinkedStack() {
        list = new LinkedList<T>();
    }

    public void push(T value) {
        list.insert(value);
    }

    public void pop() {
        list.delete();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
