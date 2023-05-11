package edu.so.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTestTest {

    @ParameterizedTest
    @CsvSource(value = {"test this | false",
            "Mom | true",
            "Ma is a nun, as I am.| true",
            " | true",
            "121 | true",
            "1212111 | false"}, delimiter = '|')
    void isPalindrome(String testString, boolean result) {
        SimpleTest simpleTest = new SimpleTest();

        if (null == testString)
            testString = "";

        assertEquals(result, simpleTest.isPalindrome(testString));
    }
}