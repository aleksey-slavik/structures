package com.structures.recursion;

public class TriangleNumbers {

    public static int getNumberAt(int pos) {
        if (pos == 1) {
            return 1;
        }

        return pos + getNumberAt(pos - 1);
    }
}
