package edu.so.test;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PalindromePredicate implements Predicate<String> {

    @Override
    public boolean test(String s) {

        if (null == s)
            return true;

        String modifiedStr = s.toLowerCase().replaceAll("[^A-Za-z1-9]", "");

        for (int count = 0; count < modifiedStr.length() / 2; count++) {
            if (modifiedStr.charAt(count) != modifiedStr.charAt(modifiedStr.length() - count - 1))
                return false;
        }

        return true;
    }
}
