# Java Interview Practice - Easy-Methods Lab

## Overview

These practice problems are designed to mirror the types of coding exercises candidates commonly encounter during junior Java developer, backend developer, support engineer, and QA automation interviews.

---

### Reverse a String

**Difficulty:** **Easy**

**Problem:** Return a string in reverse order.

**Method signature:**

```java
public static String reverseString(String str)
```

**Example:**

```text
Input:  "hello"
Output: "olleh"
```

**Skills tested:**
- Loops
- String manipulation

---

### Determine if a String Is a Palindrome

**Difficulty:** **Easy**

**Problem:** Check if a word reads the same forward and backward.

**Method signature:**

```java
public static boolean isPalindrome(String str)
```

**Examples:**

```text
Input:  "racecar"
Output: true

Input:  "hello"
Output: false
```

**Skills tested:**
- String comparison
- Loop logic

---

### Count Vowels

**Difficulty:** **Easy**

**Problem:** Count the number of vowels in a string.

**Method signature:**

```java
public static int countVowels(String str)
```

**Example:**

```text
Input:  "Education"
Output: 5
```

**Skills tested:**
- Character iteration
- Conditional statements

---

### Find the Largest Number in an Array

**Difficulty:** **Easy**

**Problem:** Return the largest value in an array.

**Method signature:**

```java
public static int findMax(int[] nums)
```

**Example:**

```text
Input:  [5, 2, 8, 1]
Output: 8
```

**Skills tested:**
- Arrays
- Iteration

---

### Count Character Occurrences

**Difficulty:** **Easy**

**Problem:** Count how many times a character appears in a string.

**Method signature:**

```java
public static int countOccurrences(String str, char target)
```

**Example:**

```text
Input:  ("banana", 'a')
Output: 3
```

**Skills tested:**
- Loops
- Character processing

---

### FizzBuzz

**Difficulty:** **Easy**

**Problem:** Print numbers from 1 to `n`.

**Rules:**
- Multiples of 3 â†’ Fizz
- Multiples of 5 â†’ Buzz
- Multiples of both 3 and 5 â†’ FizzBuzz

**Method signature:**

```java
public static void fizzBuzz(int n)
```

**Skills tested:**
- Conditional statements
- Looping
- Basic interview problem solving

--- 

## Lab Structure

For each method, you should:

### Step 1: Implement the Method

Write a working solution that satisfies the requirements.

### Step 2: Create Test Cases

Check the tests written and add if you need. Write tests that validate:
- Normal input
- Edge cases
- Invalid input (if applicable)
- Empty values
- Boundary conditions

### Step 3: Identify Edge Cases

Examples include:
- Empty strings
- Null values
- Single-element arrays
- Duplicate values
- Large datasets

### Step 4: Analyze Time Complexity

Document:

```text
Time Complexity: O(?)
Space Complexity: O(?)
```

### Step 5: Refactor the Solution

Improve:
- Readability
- Variable naming
- Method organization
- Efficiency

### Step 6: Discuss Alternative Approaches

Examples:
- Loop-based vs. recursive solutions
- Arrays vs. HashMaps
- Brute force vs. optimized algorithms

## Interview Discussion Questions

After solving each problem, ask yourself:

- How does your solution work?
- What is the time complexity?
- What is the space complexity?
- What edge cases did you consider?
- How would you optimize your solution?
- Could this be solved using a different data structure?
- How would your solution perform with one million records?

These follow-up questions closely match what candidates encounter during technical interviews and coding assessments.


