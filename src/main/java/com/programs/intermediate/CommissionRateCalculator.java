package com.programs.intermediate;

import java.util.Scanner;

/**
 * Commission Percentage Calculator
 *
 * Concept:
 * In sales, a commission is a fee paid to an employee for transacting a piece of
 * business or performing a service. This program calculates the commission rate
 * (as a percentage) when the total sales volume and the actual flat commission
 * payout are known.
 *
 * Formula:
 * Commission Percentage = (Commission Earned / Total Sales) * 100
 *
 * Edge Cases Handled:
 * - Divide-By-Zero & Negative Sales: Validates that total sales are strictly
 *   greater than zero using an IllegalArgumentException. You cannot mathematically
 *   divide by zero, and negative total sales invalidate the standard formula.
 *
 * Example 1:
 * Input:
 *   Enter the total amount of sales: 1000.00
 *   Enter the actual money earned as commission: 150.00
 * Output:
 *   The commission percentage is 15.00%
 *
 * Example 2:
 * Input:
 *   Enter the total amount of sales: 0
 * Output:
 *   Exception in thread "main" java.lang.IllegalArgumentException: Sales amount must be greater than zero.
 */

public class CommissionRateCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Commission percentage calculator ~~~");
        System.out.print("Enter the total amount of sales: ");
        double sales = sc.nextDouble();
        System.out.print("Enter the actual money earned as commission: ");
        double commission = sc.nextDouble();
        double result = calculateCommission(sales, commission);
        System.out.printf("The commission percentage is %.2f%%\n" , result);
        sc.close();
    }

    public static double calculateCommission(double sales, double commission){
        if(sales > 0){
            return (commission/sales) * 100;
        }else{
            throw new IllegalArgumentException("Sales amount must be greater than zero.");
        }
    }
}
