package com.structures.linkedlist;

import com.structures.linkedlist.base.LinkedList;
import com.structures.linkedlist.base.ListIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IteratorDemo {

    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        ListIterator<Integer> iterator = new ListIterator<Integer>(list);
        iterator.insertAfter(2);
        iterator.insertAfter(6);
        iterator.insertAfter(4);
        iterator.insertBefore(8);

        while (true) {
            System.out.print("Enter first letter of show, reset, next, get, before, after, delete, exit: ");
            System.out.flush();
            char choice = readChar();

            switch (choice) {
                case 's':
                    if (list.isEmpty()) {
                        System.out.println("Empty list!");
                    } else {
                        System.out.println(list);
                    }
                    break;
                case 'r':
                    iterator.reset();
                    break;
                case 'n':
                    if (list.isEmpty() || iterator.isEnd()) {
                        System.out.println("Cannot got to the next node.");
                    } else {
                        iterator.next();
                    }
                    break;
                case 'g':
                    if (list.isEmpty()) {
                        System.out.println("Empty list!");
                    } else {
                        System.out.println(iterator.getCurrent().value);
                    }
                    break;
                case 'b':
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    iterator.insertBefore(readInt());
                    break;
                case 'a':
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    iterator.insertAfter(readInt());
                    break;
                case 'd':
                    if (list.isEmpty()) {
                        System.out.println("Empty list!");
                    } else {
                        iterator.delete();
                    }
                    break;
                case 'e':
                    return;
                default:
                    System.out.println("Invalid entry!");
            }
        }
    }

    private static String readString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();
    }

    private static char readChar() throws IOException {
        return readString().charAt(0);
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(readString());
    }
}
