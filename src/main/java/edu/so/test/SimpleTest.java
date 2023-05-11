package edu.so.test;

import java.util.Arrays;

public class SimpleTest {

    public boolean isPalindrome (String testString) {

        String convertedString = testString.replaceAll("[^A-Za-z1-9]", "");

        String reversedString = new StringBuilder(convertedString).reverse().toString();

        return convertedString.equalsIgnoreCase(reversedString);
    }

    public int[] createArrayWithOnes (int size) {
        int[] result = new int[size];

        Arrays.fill(result, 1);

        return result;
    }

    public static void main(String[] args) {
        SimpleTest simpleTest = new SimpleTest();

        System.out.println("mom = " + simpleTest.isPalindrome("mom"));
        System.out.println("dad = " + simpleTest.isPalindrome("dad"));
        System.out.println("test this = " + simpleTest.isPalindrome("test this"));
        System.out.println("Ma is a nun, as I am. = " + simpleTest.isPalindrome("Ma is a nun, as I am."));
    }
}
