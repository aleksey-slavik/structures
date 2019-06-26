package com.structures.recursion;

import java.util.HashSet;
import java.util.Set;

public class AnagramGenerator {

    private String source;

    private Set<String> results;

    private char[] chars;

    public AnagramGenerator(String source) {
        this.source = source;
        this.chars = source.toCharArray();
        this.results = new HashSet<String>();
        processInternal(source.length());
    }

    private void processInternal(int size) {
        if (size == 1) {
            return;
        }

        for (int i = 0; i < size; i++) {
            processInternal(size - 1);

            if (size == 2) {
                results.add(String.copyValueOf(chars));
            }

            rotate(size);
        }
    }

    private void rotate(int size) {
        int pos = source.length() - size;
        char temp = chars[pos];

        for (int i = pos + 1; i < source.length(); i++) {
            chars[i - 1] = chars[i];
        }

        chars[source.length() - 1] = temp;
    }

    @Override
    public String toString() {
        return "source(" + source.length() + "): " + source + "; results(" + results.size() + "): " + results;
    }
}
