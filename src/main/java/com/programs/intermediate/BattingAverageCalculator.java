package com.programs.intermediate;

import java.util.Scanner;

/**
 * Batting Average Calculator (Cricket Statistics)
 *
 * Concept:
 * In cricket, a player's batting average is the total number of runs they have
 * scored divided by the number of times they have been dismissed (gotten out).
 *
 * Formula:
 * Batting Average = Total Runs / Times Dismissed
 *
 * Edge Cases Handled:
 * - Zero Dismissals: If a batsman has never been dismissed (0), traditional
 *   math would cause a Divide-By-Zero error. Statistically, an undefeated
 *   batsman's average defaults to their total runs.
 * - Negative Inputs: Validated using IllegalArgumentException, as it is
 *   impossible to score negative runs or have negative dismissals in sports.
 * - Integer Division: Casts 'runs' to a double during calculation to preserve
 *   the decimal places in the final average.
 *
 * Example 1 (Standard):
 * Input:
 *   Total runs: 450
 *   Times dismissed: 8
 * Output:
 *   The Batting average is 56.25
 *
 * Example 2 (Not Out / Zero Dismissals):
 * Input:
 *   Total runs: 120
 *   Times dismissed: 0
 * Output:
 *   The Batting average is 120.00
 */

public class BattingAverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Batting Average Calculator ~~~");
        System.out.print("Enter total runs: ");
        int runs = sc.nextInt();
        System.out.print("Enter times dismissed: ");
        int timesDismissed = sc.nextInt();
        double result = calculateBattingAverage(runs, timesDismissed);
        System.out.printf("The Batting average is %.2f\n", result);
        sc.close();

    }

    public static double calculateBattingAverage(int runs, int timesDismissed){

        if(timesDismissed < 0 || runs < 0){
            throw new IllegalArgumentException("Runs and dismissals cannot be negative.");
        }
        if(timesDismissed == 0){
            return runs;
        }else {
            return (double) runs / timesDismissed;
        }
    }
}
