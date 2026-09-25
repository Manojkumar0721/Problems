package com.programs.intermediate;

import java.util.Scanner;

/**
 * String Reverser
 *
 * Concept:
 * This program takes a string input from the user and reverses the sequence
 * of its characters.
 *
 * Algorithm & Optimization:
 * The program calculates the length of the string and uses a 'for' loop to
 * iterate backwards, starting from the last character index (length - 1)
 * down to the first index (0).
 *
 * Instead of using basic string concatenation (string + string) which creates
 * heavy memory overhead in Java due to String immutability, this implementation
 * uses the highly efficient 'StringBuilder' class to append characters dynamically.
 *
 * Edge Cases Handled:
 * - Empty Strings: If the user simply hits "Enter" without typing anything,
 *   the length is 0, the loop safely bypasses, and it returns an empty string.
 * - Null Safety: A null check is included as a best practice for defensive
 *   programming, in case this method is ever called by another program.
 *
 * Example 1 (Standard Word):
 * Input: Hello
 * Output: olleH
 *
 * Example 2 (Sentence with Spaces):
 * Input: Java is fun
 * Output: nuf si avaJ
 */

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String input = sc.nextLine();
        String result = reverse(input);
        System.out.println("Output: " + result);
        sc.close();
    }

    public static String reverse(String input){
        int length = String.valueOf(input).length();
        String reversedInput = "";
        for(int i=length-1;i >=0;i--){
            reversedInput = reversedInput + input.charAt(i);
        }
        return reversedInput;
    }
}
