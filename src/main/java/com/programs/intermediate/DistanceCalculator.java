package com.programs.intermediate;

import java.util.Scanner;

/**
 * Euclidean Distance Calculator (2D Plane)
 *
 * Concept:
 * This program calculates the straight-line distance between two points in a
 * 2D Cartesian coordinate system. It is a direct application of the Pythagorean
 * theorem (a^2 + b^2 = c^2), where the horizontal and vertical distances
 * between the points act as the two legs of a right triangle.
 *
 * Formula:
 * Distance = √((x2 - x1)^2 + (y2 - y1)^2)
 *
 * Edge Cases Handled:
 * - Negative Coordinates: The program safely handles coordinates in any quadrant.
 *   Because the differences (horizontal and vertical distances) are squared,
 *   negative values correctly become positive before the square root is applied.
 *
 * Example 1 (Standard 3-4-5 Triangle):
 * Input:
 *   First point: x1 = 0, y1 = 0
 *   Second point: x2 = 3, y2 = 4
 * Output:
 *   Distance between the two points is: 5.00
 *
 * Example 2 (Negative Coordinates):
 * Input:
 *   First point: x1 = -2, y1 = -3
 *   Second point: x2 = -4, y2 = 4
 * Output:
 *   Distance between the two points is: 7.28
 */

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Distance Calculator ~~~");
        System.out.println("Enter the coordinates of the First point. (x1, y1)");
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the coordinates of the Second point. (x2, y2)");
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double result = calculateDistance(x1,y1,x2,y2);
        System.out.printf("Distance between the two points is: %.2f\n", result);

        sc.close();
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2){
        double horizontalDistance = x2 - x1;
        double verticalDistance = y2 - y1;

        horizontalDistance = Math.pow(horizontalDistance, 2);
        verticalDistance = Math.pow(verticalDistance, 2);

        double sum = horizontalDistance + verticalDistance;

        return Math.sqrt(sum);

        // The entire formula condensed into one clear line
        // return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
