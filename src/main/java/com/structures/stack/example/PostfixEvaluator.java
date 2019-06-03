package com.structures.stack.example;

import com.structures.stack.base.Stack;

public class PostfixEvaluator {

    private String input;

    private Stack<Integer> stack;

    public PostfixEvaluator(String input) {
        this.input = input;
    }

    public int evaluate() {
        int answer;
        stack = new Stack<Integer>(20);

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol >= '0' && symbol <= '9') {
                stack.push(symbol - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (symbol) {
                    case '+':
                        answer = operand1 + operand2;
                        break;
                    case '-':
                        answer = operand1 - operand2;
                        break;
                    case '*':
                        answer = operand1 * operand2;
                        break;
                    case '/':
                        answer = operand1 / operand2;
                        break;
                    default:
                        answer = 0;
                }

                stack.push(answer);
            }
        }

        return stack.pop();
    }
}
