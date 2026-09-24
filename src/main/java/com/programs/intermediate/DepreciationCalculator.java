package com.programs.intermediate;

import java.util.Scanner;

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
