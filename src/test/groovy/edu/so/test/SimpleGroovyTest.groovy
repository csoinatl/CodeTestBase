package edu.so.test

import spock.lang.Specification
import spock.lang.Subject

class SimpleGroovyTest extends Specification{
    @Subject SimpleTest simpleTest

    def setup() {
        simpleTest = new SimpleTest()
    }

    def "Testing various palindromes" () {
        expect:
        result == simpleTest.isPalindrome(testString)

        where:
        testString              |       result
        "mom"                   |   true
        "dock"                  |   false
        ""                      |   true
        "123"                   |   false
        "12121"                 |   true
        "Ma is a nun, as I am." |   true
    }

    def "Testing array fill" () {
        expect:
        var result = simpleTest.createArrayWithOnes(testSize)

        expectedSize == result.size()
        expectedValue == result[testSize - 1]

        where:
        testSize    | expectedSize  | expectedValue
        1           | 1             | 1
        2           | 2             | 1
    }
}
