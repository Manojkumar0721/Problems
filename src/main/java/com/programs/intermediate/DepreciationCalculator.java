package com.programs.intermediate;

import java.util.Scanner;

/**
 * Declining Balance Depreciation Calculator
 *
 * Concept:
 * Depreciation represents how much of an asset's value has been used up over time.
 * This program calculates the "Declining Balance", where an asset loses a fixed
 * percentage of its *current* value each year, rather than a flat dollar amount.
 *
 * Logic & Formula:
 * For each year, the loss is calculated as: Loss = Current Value * (Rate / 100)
 * The new value for the next year becomes: Current Value - Loss
 *
 * Edge Cases Handled:
 * - Negative Inputs: Validates that initial value, rate, and years are all
 *   positive numbers. Financial variables cannot exist in negative space,
 *   so the program stops and returns 0.
 *
 * Example 1:
 * Input:
 *   Enter Initial value: 10000
 *   Enter depreciation percentage: 10
 *   Enter the number of years: 2
 * Output:
 *   Final Result: After 2 years, the asset is worth 8100.00
 *   (Year 1: 10000 - 1000 = 9000 -> Year 2: 9000 - 900 = 8100)
 *
 * Example 2:
 * Input:
 *   Enter Initial value: -500
 * Output:
 *   Invalid input! Negative values are not acceptable
 */

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Depreciation Calculator ~~~");
        System.out.print("Enter Initial value: ");
        double initialValue = sc.nextDouble();
        System.out.print("Enter depreciation percentage: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        double result = calculateDepreciation(initialValue,rate,years);
        System.out.println("Final Result: After " + years + " years, the asset is worth " + result);
    }

    public static double calculateDepreciation(double initialValue, double rate, int years){
        if(initialValue < 0 || rate < 0 || years < 0){
            System.out.println("Invalid input! Negative values are not acceptable");
            return 0;
        }

        double currentValue = initialValue;

        for(int i = 1; i <= years; i++){
            double loss = currentValue * (rate / 100);
            currentValue -= loss;
        }

        return currentValue;
    }

}
