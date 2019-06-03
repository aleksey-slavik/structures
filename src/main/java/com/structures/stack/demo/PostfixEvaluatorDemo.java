package com.structures.stack.demo;

import com.structures.stack.example.PostfixEvaluator;

import java.io.IOException;

public class PostfixEvaluatorDemo extends DemoBase {

    public static void main(String[] args) throws IOException {
        System.out.println("String reverser demo:");
        System.out.println("Enter postfix string:");
        String input = readLine();
        PostfixEvaluator evaluator = new PostfixEvaluator(input);
        System.out.print("Evaluate expression:");
        System.out.println(evaluator.evaluate());
    }
}
