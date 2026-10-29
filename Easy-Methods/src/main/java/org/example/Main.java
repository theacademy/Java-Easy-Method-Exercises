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
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // check if a string is a palindrome
    public static boolean isPalindrome(String str){
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    // count the number of vowels in a string
    public static int countVowels(String str){
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // find the maximum value in an array of integers
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // count the number of occurrences of a character in a string
    public static int countCharacters(String str, char target){
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
    // print numbers from 1 to n,
    // replacing multiples of 3 with "Fizz",
    // multiples of 5 with "Buzz", and multiples of both with "FizzBuzz"

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}