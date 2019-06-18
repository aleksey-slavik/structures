package com.structures.linkedlist.base;

public class DoublyLinkedList<T extends Comparable> {

    private DoublyNode<T> first;

    private DoublyNode<T> last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(T value) {
        DoublyNode<T> newNode = new DoublyNode<T>(value);

        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }

        newNode.next = first;
        first = newNode;
    }

    public void insertLast(T value) {
        DoublyNode<T> newNode = new DoublyNode<T>(value);

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }

        last = newNode;
    }

    public void insertAfter(T key, T value) {
        DoublyNode<T> current = first;

        while (current.value.compareTo(key) != 0) {
            current = current.next;

            if (current == null) {
                throw new KeyNotFoundException();
            }
        }

        DoublyNode<T> newNode = new DoublyNode<T>(value);

        if (current == last) {
            newNode.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }

        newNode.previous = current;
        current.next = newNode;
    }

    public void deleteFirst() {
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }

        first = first.next;
    }

    public void deleteLast() {
        if (last.previous == null) {
            first = null;
        } else {
            last.previous.next = null;
        }

        last = last.previous;
    }

    public void deleteByKey(T key) {
        DoublyNode<T> current = first;

        while (current.value.compareTo(key) != 0) {
            current = current.next;

            if (current == null) {
                throw new KeyNotFoundException();
            }
        }

        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
    }

    public String displayForward() {
        DoublyNode<T> current = first;
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

    public String displayBackward() {
        DoublyNode<T> current = last;
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        while (current != null) {
            builder.append(current).append(", ");
            current = current.previous;
        }

        return builder.delete(builder.length() - 2, builder.length())
                .append("]")
                .toString();
    }
}
