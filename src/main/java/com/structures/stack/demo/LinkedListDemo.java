package com.structures.stack.demo;

import com.structures.stack.base.LinkedStack;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        stack.push(20);
        stack.push(40);
        System.out.println(stack);
        stack.push(60);
        stack.push(80);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
    }
}
