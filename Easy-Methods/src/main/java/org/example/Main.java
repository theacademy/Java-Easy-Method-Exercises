package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello, World!"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(countVowels("I love Java!"));

        int[] numbers = {3, 5, 2, 8, 1};
        System.out.println(findMax(numbers));

        System.out.println(countCharacters("bananas", 'a'));
        fizzBuzz(15);
    }

    // return a string that is the reverse of the input string
    public static String reverseString(String str){
        return null;
    }

    // check if a string is a palindrome
    public static boolean isPalindrome(String str){
        return false;
    }

    // count the number of vowels in a string
    public static int countVowels(String str){
        return -99;    }

    // find the maximum value in an array of integers
    public static int findMax(int[] arr){
        return -99;
    }

    // count the number of occurrences of a character in a string
    public static int countCharacters(String str, char target){
        return -99;
    }


    // print numbers from 1 to n,
    // replacing multiples of 3 with "Fizz",
    // multiples of 5 with "Buzz", and multiples of both with "FizzBuzz"

    public static void fizzBuzz(int n) {

    }
}