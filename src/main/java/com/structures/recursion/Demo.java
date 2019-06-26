package com.structures.recursion;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        int pos = generateNumber(20);
        System.out.println("Triangle number at " + pos + ": " + TriangleNumbers.getNumberAt(pos));
        pos = generateNumber(20);
        System.out.println("Factorial number at " + pos + ": " + Factorial.getNumberAt(pos));
        AnagramGenerator anagramGenerator = new AnagramGenerator(generateValue());
        System.out.println("Anagram generator: " + anagramGenerator);
    }

    private static int generateNumber(int bound) {
        return new Random().nextInt(bound) + 1;
    }

    private static String generateValue() {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = generateNumber(10);
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }
}
