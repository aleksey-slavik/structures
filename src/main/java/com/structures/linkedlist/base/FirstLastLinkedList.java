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

    public T deleteFirst() {
        T temp = first.value;

        if (first.next == null) {
            last = null;
        }

        first = first.next;
        return temp;
    }

    @Override
    public String toString() {
        Node<T> current = first;
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
