package com.structures.linkedlist.base;

public class SortedLinkedList<T extends Comparable> extends LinkedList<T> {

    public SortedLinkedList(Node<T>[] list) {
        super();

        for (Node<T> item : list) {
            insert(item);
        }
    }

    public void insert(Node<T> node) {
        Node<T> previous = null;
        Node<T> current = item;

        while (current != null && node.value.compareTo(current.value) > 0) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            item = node;
        } else {
            previous.next = node;
        }

        node.next = current;
    }
}
