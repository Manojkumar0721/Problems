package com.programs.intermediate;

import java.util.Scanner;

/**
 * Vowel or Consonant Checker
 *
 * Concept:
 * In the English alphabet, letters are categorized into vowels (A, E, I, O, U)
 * and consonants (all other alphabetical letters).
 *
 * Algorithm & Optimization:
 * The program first standardizes the input by converting it to lowercase, halving
 * the number of checks required. It then verifies the character falls within the
 * valid alphabetical ASCII range ('a' to 'z'). Finally, it leverages a 'switch'
 * statement with intentional "fall-through" logic to group all vowel cases together
 * efficiently.
 *
 * Edge Cases Handled:
 * - Uppercase Letters: Safely handled via Character.toLowerCase().
 * - Numbers and Symbols: Filtered out using ASCII boundary checks. Any non-letter
 *   triggers an "Invalid input!" response.
 * - Multi-character Strings: The program safely isolates only the very first
 *   character entered using charAt(0).
 *
 * Example 1 (Vowel - Case Insensitive):
 * Input: E
 * Output: e is a Vowel
 *
 * Example 2 (Consonant):
 * Input: z
 * Output: z is a Consonant
 *
 * Example 3 (Symbol/Number):
 * Input: 7
 * Output: Invalid input! Please enter an alphabetical letter.
 */

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single Character: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);
        if(ch >='a' && ch <= 'z'){
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is Vowel");
                    break;
                default:
                    System.out.println(ch + " is consonant");
            }
        }else{
            System.out.println("Invalid input!");
        }
    }
}
