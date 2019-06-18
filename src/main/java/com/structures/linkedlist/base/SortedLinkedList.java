package com.structures.linkedlist.base;

public class SortedLinkedList<T extends Comparable> extends LinkedList<T> {

    public SortedLinkedList(T[] list) {
        super();

        for (T item : list) {
            insert(item);
        }
    }

    public void insert(T value) {
        Node<T> previous = null;
        Node<T> current = item;
        Node<T> temp = new Node<T>(value);

        while (current != null && value.compareTo(current.value) > 0) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            item = temp;
        } else {
            previous.next = temp;
        }

        temp.next = current;
    }
}
