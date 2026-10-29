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
    }

    @Test
    void isPalindromeRequiresExactCharacterMatch() {
        assertEquals(true, Main.isPalindrome("racecar"));
    }

    @Test
    void countVowelsCountsBothCasesAndReturnsZeroWhenNoneExist() {
        assertEquals(5, Main.countVowels("I love Java!"));
    }

    @Test
    void findMaxHandlesDuplicatesAndIntegerBoundaries() {
        assertEquals(8, Main.findMax(new int[]{3, 5, 2, 8, 1}));
    }

    @Test
    void findMaxRejectsAnEmptyArray() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Main.findMax(new int[]{}));
    }

    @Test
    void countCharactersCountsMatchesIncludingZeroAndEmptyInput() {
        assertEquals(3, Main.countCharacters("bananas", 'a'));
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
