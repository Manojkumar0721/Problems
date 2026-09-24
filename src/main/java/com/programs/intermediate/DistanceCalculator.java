package com.programs.intermediate;

import java.util.Scanner;

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
