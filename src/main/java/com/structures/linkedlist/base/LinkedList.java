package com.structures.linkedlist.base;

public class LinkedList<T> {

    private Node<T> item;

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

    public T delete() {
        Node<T> temp = item;
        item = item.next;
        return temp.value;
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
