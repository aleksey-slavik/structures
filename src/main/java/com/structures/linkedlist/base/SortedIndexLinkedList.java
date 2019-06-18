package com.structures.linkedlist.base;

public class SortedIndexLinkedList<T> extends IndexLinkedList<T> {

    public SortedIndexLinkedList() {
        super();
    }

    @Override
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
}
