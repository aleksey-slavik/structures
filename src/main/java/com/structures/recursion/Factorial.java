package com.structures.recursion;

public class Factorial {

    public static int getNumberAt(int pos) {
        if (pos == 0) {
            return 1;
        }

        return pos * getNumberAt(pos - 1);
    }
}
