package com.programs.intermediate;

import java.util.Scanner;

/**
 * Tiered Electricity Bill Calculator
 *
 * Concept:
 * Most utility companies use a tiered (or slab-based) pricing model to encourage
 * energy conservation. The more electricity you use, the higher the rate you pay
 * for the units that spill over into the next tier.
 *
 * Pricing Slabs Used:
 * - First 100 units (0 to 100): 5.00 per unit
 * - Next 100 units (101 to 200): 7.00 per unit
 * - Above 200 units (201+): 10.00 per unit
 *
 * Edge Cases Handled:
 * - Negative Inputs: Validates that energy consumption cannot be less than 0.
 *   If a negative number is entered, the program prints an error and returns 0.
 *
 * Example 1 (Tier 1 Only):
 * Input:
 *   Enter the unit of Electricity consumed: 80
 * Output:
 *   Electricity Bill: 400.00 (80 * 5), Total units used: 80
 *
 * Example 2 (Spills into Tier 2):
 * Input:
 *   Enter the unit of Electricity consumed: 150
 * Output:
 *   Electricity Bill: 850.00 (100*5 + 50*7), Total units used: 150
 *
 * Example 3 (Spills into Tier 3):
 * Input:
 *   Enter the unit of Electricity consumed: 250
 * Output:
 *   Electricity Bill: 1700.00 (100*5 + 100*7 + 50*10), Total units used: 250
 */

public class ElectricityBillCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit of Electricity consumed: ");
        int units = sc.nextInt();
        double result = calculateEBill(units);
        System.out.println("Electricity Bill: " + result + ", " + "Total units used: " + units);
        sc.close();
    }

    public static double calculateEBill(int units){
        if(units < 0){
            System.out.println("Invalid inputs: Units cannot be negative.");
            return 0;
        }
        double bill = 0;
        if(units <= 100){
            bill = units * 5;
        }else if(units <= 200) {
            bill = 100 * 5;
            bill += ((units -100) * 7);
        }else{
            bill = 100 * 5;
            bill += (100 * 7);
            bill += ((units - 200) * 10);
        }
        return bill;
    }
}
