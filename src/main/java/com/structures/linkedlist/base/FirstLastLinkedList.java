package com.structures.linkedlist.base;

public class FirstLastLinkedList<T> {

    private Node<T> first;

    private Node<T> last;

    public FirstLastLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(T value) {
        Node<T> node = new Node<T>(value);

        if (isEmpty()) {
            last = node;
        }

        node.next = first;
        first = node;
    }

    public void insertLast(T value) {
        Node<T> node = new Node<T>(value);

        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
        }

        last = node;
    }

    public void deleteFirst() {
        if (first.next == null) {
            last = null;
        }

        first = first.next;
    }

    @Override
    public String toString() {
        Node<T> current = first;
        StringBuilder builder = new StringBuilder();

        while (current != null) {
            builder.append(current);
            current = current.next;
        }

        return builder.toString();
    }
}
