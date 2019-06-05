package com.structures.linkedlist;

public class LinkedList<T> {

    private LinkedListItem<T> item;

    public LinkedList() {
        item = null;
    }

    public boolean isEmpty() {
        return item == null;
    }

    public void insert(int index, T value) {
        LinkedListItem<T> newItem = new LinkedListItem<T>(index, value);
        newItem.next = item;
        item = newItem;
    }

    public LinkedListItem<T> find(int key) {
        LinkedListItem<T> current = item;

        while (current.index != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }

        return current;
    }

    public void delete(int key) {
        LinkedListItem<T> current = item;
        LinkedListItem<T> previous = item;

        while (current.index != key) {
            if (current.next == null) {
                return;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == item) {
            item = item.next;
        } else {
            previous.next = current.next;
        }
    }

    public void delete() {
        item = item.next;
    }

    @Override
    public String toString() {
        LinkedListItem<T> current = item;
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        while (current != null) {
            builder.append(current).append(", ");
            current = current.next;
        }

        return builder
                .delete(builder.length() - 2, builder.length())
                .append("]")
                .toString();
    }
}
