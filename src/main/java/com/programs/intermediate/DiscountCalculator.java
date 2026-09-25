package com.programs.intermediate;

import java.util.Scanner;

/**
 * Discount Calculator
 *
 * Concept:
 * This program calculates the monetary value of a percentage-based discount
 * and determines the final sale price of an item after the discount is applied.
 *
 * Formulas:
 * Discount Amount = (Original Price * Discount Percentage) / 100
 * Final Price = Original Price - Discount Amount
 *
 * Edge Cases Handled:
 * - Negative Values: The original price and discount rate cannot be negative.
 * - Over-Discounting: Validates that the discount rate does not exceed 100%.
 *   A discount greater than 100% would result in a negative final price (the
 *   seller owing the buyer money), which is an invalid retail state.
 *
 * Example 1:
 * Input:
 *   Enter Original price: 150.00
 *   Enter Discount percentage: 20
 * Output:
 *   Final price: 120.00, Discount Amount: 30.00
 *
 * Example 2:
 * Input:
 *   Enter Original price: 100.00
 *   Enter Discount percentage: 110
 * Output:
 *   Invalid input!, Price: 100.0,  discountRate: 110
 */

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Original price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Discount percentage: ");
        int discountRate = sc.nextInt();
        calculateDiscount(price,discountRate);

    }

    public static void calculateDiscount(double price, int discountRate){
        if(price < 0 || discountRate < 0 || discountRate > 100){
            System.out.println("Invalid input!, " + "Price: " + price + ", " + " discountRate: " + discountRate);
            return;
        }

        double discountAmount = (price * discountRate)/100;
        double finalPrice = price - discountAmount;

        System.out.println("Final price: " + finalPrice + ", " + "Discount Amount: " + discountAmount);

    }
}
