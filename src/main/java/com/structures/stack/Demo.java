package com.structures.stack;

import com.structures.stack.base.EmptyStackException;
import com.structures.stack.example.BracketChecker;
import com.structures.stack.example.InvalidBracketException;
import com.structures.stack.example.StringReverser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

    public static void main(String[] args) throws IOException {
        System.out.println("String reverser demo:");
        System.out.println("Enter original string:");
        String input = readLine();
        StringReverser reverser = new StringReverser(input);
        System.out.println("Reversed string:");
        System.out.println(reverser.reverse());
        System.out.println("--------------------------------------------------");

        System.out.println("Bracket checker demo:");
        System.out.println("Enter original string:");
        input = readLine();
        BracketChecker checker = new BracketChecker(input);
        try {
            System.out.println(checker.check() ? "String is valid" : "Brackets in string have incorrect order");
        } catch (EmptyStackException e) {
            System.out.println("Try to call pop() method for empty stack!");
        } catch (InvalidBracketException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------------------------------");
    }

    private static String readLine() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();
    }
}
