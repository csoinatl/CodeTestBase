package edu.so.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTestTest {

    @ParameterizedTest
    @CsvSource(value = {"test this | false", "Mom | true", "Ma is a nun, as I am.| true"}, delimiter = '|')
    void isPalindrome(String testString, boolean result) {
        SimpleTest simpleTest = new SimpleTest();

        assertEquals(result, simpleTest.isPalindrome(testString));
    }
}