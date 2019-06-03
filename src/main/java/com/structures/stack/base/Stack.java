package com.structures.stack.base;

public class Stack<T> {

    private int size;

    private T[] stack;

    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        this.size = size;
        stack = (T[]) new Object[size];
        top = -1;
    }

    public void push(T value) {
        stack[++top] = value;
    }

    public T pop() {
        return stack[top--];
    }

    public T peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}
