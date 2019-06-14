package com.structures.linkedlist.base;

public class SortedIndexLinkedList<T> {

    private NodeWithIndex<T> item;

    public SortedIndexLinkedList() {
        item = null;
    }

    public void insert(int index, T value) {
        NodeWithIndex<T> newItem = new NodeWithIndex<T>(index, value);
        NodeWithIndex<T> previous = null;
        NodeWithIndex<T> current = item;

        while (current != null && index > current.index) {
            previous = current;
            current = (NodeWithIndex<T>) current.next;
        }

        if (previous == null) {
            item = newItem;
        } else {
            previous.next = newItem;
        }

        newItem.next = current;
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

        return builder.delete(builder.length() - 2, builder.length())
                .append("]")
                .toString();
    }
}
