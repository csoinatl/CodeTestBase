package edu.so.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PalindromePredicateTest {

    @ParameterizedTest
    @CsvSource(value = {"test this | false",
            "Mom | true",
            "Ma is a nun, as I am.| true",
            " | true",
            "121 | true",
            "1212111 | false"}, delimiter = '|')
    void isPalindromeTest (String testString, boolean result) {
        PalindromePredicate predicate = new PalindromePredicate();

        Assertions.assertEquals(result, predicate.test(testString));
    }
}
