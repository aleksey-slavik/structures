package com.structures.stack.example;

import com.structures.stack.base.EmptyStackException;
import com.structures.stack.base.Stack;

public class BracketChecker {

    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public boolean check() throws EmptyStackException, InvalidBracketException {
        Stack<Character> stack = new Stack<Character>(input.length());

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            switch (current) {
                case '{':
                case '[':
                case '(':
                    stack.push(current);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stack.isEmpty()) {
                        char saved = stack.pop();
                        if (saved == '{' && current != '}' ||
                                saved == '[' && current != ']' ||
                                saved == '(' && current != ')') {
                            throw new InvalidBracketException("Incorrect bracket sequence for " + current + " at " + i);
                        }
                    } else {
                        throw new EmptyStackException();
                    }
                    break;
                default:
                    break;
            }
        }

        return stack.isEmpty();
    }
}
