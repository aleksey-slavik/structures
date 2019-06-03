package com.structures.stack.demo;

import com.structures.stack.example.StringReverser;

import java.io.IOException;

public class StringReverserDemo extends DemoBase {

    public static void main(String[] args) throws IOException {
        System.out.println("String reverser demo:");
        System.out.println("Enter original string:");
        String input = readLine();
        StringReverser reverser = new StringReverser(input);
        System.out.println("Reversed string:");
        System.out.println(reverser.reverse());
    }
}
