package com.structures.stack.demo;

import com.structures.stack.example.InfixToPostfixTransformer;

import java.io.IOException;

public class InfixToPostfixDemo extends DemoBase {

    public static void main(String[] args) throws IOException {
        System.out.println("Infix to postfix demo:");
        System.out.println("Enter infix string:");
        String input = readLine();
        InfixToPostfixTransformer transformer = new InfixToPostfixTransformer(input);
        System.out.println("Postfix string:");
        System.out.println(transformer.transform());
    }
}
