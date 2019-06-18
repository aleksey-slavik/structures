package com.structures.linkedlist.base;

public class ListIterator<T> {

    private Node<T> current;

    private Node<T> previous;

    private LinkedList<T> list;

    public ListIterator(LinkedList<T> list) {
        this.list = list;
        reset();
    }

    public Node<T> getCurrent() {
        return current;
    }

    public void reset() {
        current = list.item;
        previous = null;
    }

    public void next() {
        previous = current;
        current = current.next;
    }

    public boolean isEnd() {
        return current.next == null;
    }

    public void insertAfter(T value) {
        Node<T> newNode = new Node<T>(value);

        if (list.isEmpty()) {
            list.item = newNode;
            current = newNode;
        } else {
            newNode.next = current.next;
            current.next = newNode;
            next();
        }
    }

    public void insertBefore(T value) {
        Node<T> newNode = new Node<T>(value);

        if (previous == null) {
            newNode.next = list.item;
            list.item = newNode;
            reset();
        } else {
            newNode.next = previous.next;
            previous.next = newNode;
            current = newNode;
        }
    }

    public void delete() {
        if (previous == null) {
            list.item = current.next;
            reset();
        } else {
            previous.next = current.next;

            if (isEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
    }
}
