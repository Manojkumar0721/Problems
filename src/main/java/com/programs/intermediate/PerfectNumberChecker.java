package com.programs.intermediate;

import java.util.Scanner;

/**
 * Perfect Number Checker
 *
 * Concept:
 * In number theory, a perfect number is a positive integer that is exactly
 * equal to the sum of its proper divisors, excluding the number itself.
 *
 * Algorithm & Optimization:
 * The program finds all proper divisors using the modulo operator (%).
 * To optimize performance, the loop only iterates up to (number / 2).
 * This is because mathematically, a number cannot have any proper divisors
 * that are larger than exactly half of its value.
 *
 * Edge Cases Handled:
 * - Negatives, Zero, and One: Perfect numbers are strictly positive integers
 *   greater than 1. If the input is <= 1, the loop is bypassed and returns false.
 *
 * Example 1 (The First Perfect Number):
 * Input: 6
 * Output: 6 is a Perfect Number.
 * (Divisors of 6 are 1, 2, and 3. 1 + 2 + 3 = 6)
 *
 * Example 2 (The Second Perfect Number):
 * Input: 28
 * Output: 28 is a Perfect Number.
 * (Divisors of 28 are 1, 2, 4, 7, and 14. 1 + 2 + 4 + 7 + 14 = 28)
 *
 * Example 3 (Non-Perfect Number):
 * Input: 10
 * Output: 10 is not a Perfect Number.
 * (Divisors of 10 are 1, 2, and 5. 1 + 2 + 5 = 8, which is not 10)
 */

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Perfect Number Calculator ~~~");
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPerfectNum = calculatePerfectNum(number);
        if(isPerfectNum){
            System.out.println(number + " Perfect Number.");
        }else{
            System.out.println(number + " not a Perfect Number.");
        }
        sc.close();
    }

    public static boolean calculatePerfectNum(int number){
        if(number<=1){
            System.out.println(number + " is not a perfect Number");
            return false;
        }
        int sum = 0;
        for(int i = 1; i <= number/2; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        return sum == number;
    }
}
