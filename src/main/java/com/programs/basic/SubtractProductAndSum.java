package com.programs.basic;

import java.util.Scanner;

/**
 * Subtract the Product and Sum of Digits of an Integer
 *
 * Concept:
 * This algorithm extracts the individual digits of a number to calculate
 * two separate running totals: the product of all digits, and the sum of
 * all digits. Finally, it returns the difference between the two.
 *
 * Algorithm (Digit Extraction):
 * The program isolates the last digit of the number using the modulo
 * operator (n % 10). After updating the product and sum, it removes that
 * last digit by dividing by 10 (n / 10), repeating until no digits remain.
 *
 * Edge Cases Handled:
 * - Zero Input: If the input is 0, the digits are just 0. The product is 0,
 *   the sum is 0, so the difference is correctly returned as 0.
 * - Negative Numbers: The digits of -234 are still 2, 3, and 4. Math.abs()
 *   is used to safely strip the negative sign before processing the digits.
 *
 * Example 1:
 * Input: 234
 * Output: 15
 * Explanation:
 *   Product of digits = 2 * 3 * 4 = 24
 *   Sum of digits = 2 + 3 + 4 = 9
 *   Result = 24 - 9 = 15
 *
 * Example 2:
 * Input: 4421
 * Output: 21
 * Explanation:
 *   Product of digits = 4 * 4 * 2 * 1 = 32
 *   Sum of digits = 4 + 4 + 2 + 1 = 11
 *   Result = 32 - 11 = 21
 */
public class SubtractProductAndSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~ Product and Sum of Digits ~~~");
        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        int finalResult = subtractProductAndSum(num);

        System.out.println("Result: " + finalResult);

        scanner.close();
    }

    public static int subtractProductAndSum(int n){
        // Edge case: mathematically, the digits of 0 compute to a result of 0
        if (n == 0) {
            return 0;
        }

        // Safely handles negative inputs so the modulo math still works
        n = Math.abs(n);

        int product = 1;
        int sum = 0;

        // Loop continues until all digits have been truncated
        while (n > 0){
            int remainder = n % 10;
            product = product * remainder;
            sum = sum + remainder;
            n = n / 10;
        }

        return product - sum;
    }
}