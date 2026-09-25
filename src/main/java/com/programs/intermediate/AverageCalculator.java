package com.programs.intermediate;

import java.util.Scanner;

/**
 * Average Calculator
 *
 * Concept:
 * The arithmetic mean (average) is the sum of a collection of numbers
 * divided by the count of numbers in the collection.
 *
 * Formula:
 * Average = (Sum of all items) / (Number of items)
 *
 * Edge Cases Handled:
 * - If the user enters 0 or a negative number for the count, the program
 *   catches it to prevent a Divide-By-Zero error (NaN) and returns 0.
 *
 * Example 1:
 * Input:
 *   How many numbers: 3
 *   Number 1: 10
 *   Number 2: 15
 *   Number 3: 20
 * Output:
 *   Average: 15.0  // (10 + 15 + 20) / 3
 *
 * Example 2:
 * Input:
 *   How many numbers: 0
 * Output:
 *   Invalid input! please insert valid number.
 *   Average: 0.0
 */

public class AverageCalculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("How many numbers do you want to average please enter: ");
        int num = sc.nextInt();
        double result = calculateAverage(num);
        System.out.println("Average: " + result);
        sc.close();
    }

    public static double calculateAverage(int n){
        if(n<=0){
            System.out.println("Invalid input! please insert valid number.");
            return 0;
        }
        double sum = 0;

        for(int i = 1; i<=n; i++){
            System.out.print("Enter the number " + i + ": ");
            int userInput = sc.nextInt();
            sum += userInput;
        }
        return sum / n;
    }
}
