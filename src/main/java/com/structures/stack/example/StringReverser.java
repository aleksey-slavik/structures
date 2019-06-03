package com.structures.stack.example;

import com.structures.stack.base.Stack;

public class StringReverser {

    private String input;

    public StringReverser(String input) {
        this.input = input;
    }

    public String reverse() {
        Stack<Character> stack = new Stack<Character>(input.length());

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        StringBuilder output = new StringBuilder();

        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.toString();
    }
}
