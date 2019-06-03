package com.structures.stack.example;

import com.structures.stack.base.Stack;

public class InfixToPostfix {

    private String input;

    private StringBuilder output;

    private Stack<Character> stack;

    public InfixToPostfix(String input) {
        this.input = input;
        output = new StringBuilder();
        stack = new Stack<Character>(input.length());
    }

    public String transform() {
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            switch (current) {
                case '+':
                case '-':
                    checkOperator(current, 1);
                    break;
                case '*':
                case '/':
                    checkOperator(current, 2);
                    break;
                case '(':
                    stack.push(current);
                    break;
                case ')':
                    checkBracket();
                    break;
                default:
                    output.append(current);
                    break;
            }
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.toString();
    }

    private void checkOperator(char operator, int priority) {
        while (!stack.isEmpty()) {
            char top = stack.pop();

            if (top == '(') {
                stack.push(top);
                break;
            } else {
                int newPriority;

                if (top == '+' || top == '-') {
                    newPriority = 1;
                } else {
                    newPriority = 2;
                }

                if (newPriority < priority) {
                    stack.push(top);
                    break;
                } else {
                    output.append(top);
                }
            }
        }

        stack.push(operator);
    }

    private void checkBracket() {
        while (!stack.isEmpty()) {
            char top = stack.pop();

            if (top == '(') {
                break;
            } else {
                output.append(top);
            }
        }
    }
}
