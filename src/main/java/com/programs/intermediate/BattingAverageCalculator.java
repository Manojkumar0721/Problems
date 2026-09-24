package com.programs.intermediate;

import java.util.Scanner;

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
