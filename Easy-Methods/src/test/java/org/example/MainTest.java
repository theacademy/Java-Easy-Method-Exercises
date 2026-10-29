package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {
    @Test
    void constructorCanBeInvoked() {
        new Main();
    }

    @Test
    void reverseStringHandlesTypicalAndEmptyStrings() {
        assertEquals("!dlroW ,olleH", Main.reverseString("Hello, World!"));
        assertEquals("", Main.reverseString(""));
        assertEquals("a", Main.reverseString("a"));
    }

    @Test
    void isPalindromeRequiresExactCharacterMatch() {
        assertEquals(true, Main.isPalindrome("racecar"));
        assertEquals(true, Main.isPalindrome(""));
        assertEquals(false, Main.isPalindrome("Racecar"));
        assertEquals(false, Main.isPalindrome("hello"));
    }

    @Test
    void countVowelsCountsBothCasesAndReturnsZeroWhenNoneExist() {
        assertEquals(5, Main.countVowels("I love Java!"));
        assertEquals(0, Main.countVowels("rhythm"));
        assertEquals(0, Main.countVowels(""));
        assertEquals(10, Main.countVowels("aeiouAEIOU"));
    }

    @Test
    void findMaxHandlesDuplicatesAndIntegerBoundaries() {
        assertEquals(8, Main.findMax(new int[]{3, 5, 2, 8, 1}));
        assertEquals(-2, Main.findMax(new int[]{-9, -2, -7}));
        assertEquals(Integer.MIN_VALUE, Main.findMax(new int[]{Integer.MIN_VALUE}));
        assertEquals(Integer.MAX_VALUE, Main.findMax(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}));
    }

    @Test
    void findMaxRejectsAnEmptyArray() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Main.findMax(new int[]{}));
    }

    @Test
    void countCharactersCountsMatchesIncludingZeroAndEmptyInput() {
        assertEquals(3, Main.countCharacters("bananas", 'a'));
        assertEquals(0, Main.countCharacters("bananas", 'z'));
        assertEquals(0, Main.countCharacters("", 'a'));
    }

    @Test
    void fizzBuzzPrintsAllCasesAndDoesNothingForNonPositiveInput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(output, true, StandardCharsets.UTF_8));

            Main.fizzBuzz(15);
            assertEquals(
                    "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n",
                    output.toString(StandardCharsets.UTF_8).replace("\r\n", "\n"));

            output.reset();
            Main.fizzBuzz(0);
            assertEquals("", output.toString(StandardCharsets.UTF_8));
            Main.fizzBuzz(-1);
            assertEquals("", output.toString(StandardCharsets.UTF_8));
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    void mainRunsAllExamples() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(output, true, StandardCharsets.UTF_8));
            Main.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        assertEquals(
                "!dlroW ,olleH\ntrue\n5\n8\n3\n"
                        + "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n",
                output.toString(StandardCharsets.UTF_8).replace("\r\n", "\n"));
    }

}
