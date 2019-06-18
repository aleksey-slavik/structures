package com.structures.linkedlist.base;

public class LinkedList<T> {

    protected Node<T> item;

    public LinkedList() {
        item = null;
    }

    public boolean isEmpty() {
        return item == null;
    }

    public void insert(T value) {
        Node<T> newItem = new Node<T>(value);
        newItem.next = item;
        item = newItem;
    }

    public void delete() {
        item = item.next;
    }

    @Override
    public String toString() {
        Node<T> current = item;
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        while (current != null) {
            builder.append(current).append(", ");
            current = current.next;
        }

        return builder.delete(builder.length() - 2, builder.length())
                .append("]")
                .toString();
    }
}
