package com.structures.recursion;

public class HanojTowers {

    public static void main(String[] args) {
        move(4, 'A', 'B', 'C');
    }

    private static void move(int top, char from, char inner, char to) {
        if (top == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            move(top - 1, from, to, inner);
            System.out.println("Disk " + top + " from " + from + " to " + to);
            move(top - 1, inner, from, to);
        }
    }
}
