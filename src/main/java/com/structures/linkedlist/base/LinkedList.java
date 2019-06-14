package com.structures.linkedlist.base;

public class LinkedList<T> {

    private NodeWithIndex<T> item;

    public LinkedList() {
        item = null;
    }

    public boolean isEmpty() {
        return item == null;
    }

    public void insert(int index, T value) {
        NodeWithIndex<T> newItem = new NodeWithIndex<T>(index, value);
        newItem.next = item;
        item = newItem;
    }

    public NodeWithIndex<T> find(int key) {
        NodeWithIndex<T> current = item;

        while (current.index != key) {
            if (!current.hasNext()) {
                return null;
            } else {
                current = (NodeWithIndex<T>) current.next;
            }
        }

        return current;
    }

    public void delete(int key) {
        NodeWithIndex<T> current = item;
        NodeWithIndex<T> previous = item;

        while (current.index != key) {
            if (!current.hasNext()) {
                return;
            } else {
                previous = current;
                current = (NodeWithIndex<T>) current.next;
            }
        }

        if (current == item) {
            item = (NodeWithIndex<T>) item.next;
        } else {
            previous.next = current.next;
        }
    }

    public void delete() {
        item = (NodeWithIndex<T>) item.next;
    }

    @Override
    public String toString() {
        NodeWithIndex<T> current = item;
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        while (current != null) {
            builder.append(current).append(", ");
            current = (NodeWithIndex<T>) current.next;
        }

        return builder
                .delete(builder.length() - 2, builder.length())
                .append("]")
                .toString();
    }
}
