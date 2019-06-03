package com.structures.stack.demo;

import com.structures.stack.base.EmptyStackException;
import com.structures.stack.example.BracketChecker;
import com.structures.stack.example.InvalidBracketException;

import java.io.IOException;

public class BracketCheckerDemo extends DemoBase {

    public static void main(String[] args) throws IOException {
        System.out.println("Bracket checker demo:");
        System.out.println("Enter original string:");
        String input = readLine();
        BracketChecker checker = new BracketChecker(input);
        try {
            System.out.println(checker.check() ? "String is valid" : "Brackets in string have incorrect order");
        } catch (EmptyStackException e) {
            System.out.println("Try to call pop() method for empty stack!");
        } catch (InvalidBracketException e) {
            System.out.println(e.getMessage());
        }
    }
}
