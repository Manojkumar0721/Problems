package com.programs.intermediate;

import java.util.Scanner;

/**
 * CGPA (Cumulative Grade Point Average) Calculator
 *
 * Concept:
 * CGPA is the arithmetic mean of the grade points achieved across multiple
 * subjects or semesters. In specific education systems (such as the CBSE
 * board in India), a standard multiplier of 9.5 is used to estimate the
 * equivalent overall percentage.
 *
 * Formulas:
 * CGPA = (Sum of Grade Points for all Subjects) / Total Number of Subjects
 * Equivalent Percentage = CGPA * 9.5
 *
 * Edge Cases Handled:
 * - Divide-By-Zero: If the user inputs 0 or a negative number for the total
 *   subjects, the program stops the calculation and returns 0.0 to prevent
 *   a NaN (Not a Number) memory error.
 *
 * Example 1:
 * Input:
 *   Enter a number of Subjects: 3
 *   Enter Grade of 1 subject: 9.0
 *   Enter Grade of 2 subject: 8.5
 *   Enter Grade of 3 subject: 8.0
 * Output:
 *   Your CGPA is 8.50 (Equivalent to 80.75%)
 *
 * Example 2:
 * Input:
 *   Enter a number of Subjects: 0
 * Output:
 *   Invalid number of subjects.
 *   Your CGPA is 0.00 (Equivalent to 0.00%)
 */

public class CgpaCalculator {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number of Subjects: ");
        int numSubjects = sc.nextInt();
        double totalGrade = calculateCgpa(numSubjects);
        double percentage = totalGrade * 9.5;
        System.out.printf("Your CGPA is %.2f(Equivalent to %.2f%%)\n", totalGrade, percentage);
        sc.close();
    }

    public static double calculateCgpa(int numSubjects){
        if(numSubjects <=0){
            System.out.println("Invalid number of subjects.");
            return 0.0;
        }
        double totalGrade = 0.0;
        for(int i = 1; i<= numSubjects; i++){
            System.out.print("Enter Grade of " + i + " subject: ");
            totalGrade = totalGrade + sc.nextDouble();
        }
        return totalGrade / numSubjects;
    }
}
