package com.programs.intermediate;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Power Calculator ~~~");
        System.out.print("Enter the base value: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent value: ");
        int exponent = sc.nextInt();
        double finalResult = calculatePower(base, exponent);
        System.out.println("Final result: " + finalResult);
        sc.close();
    }

    public static double calculatePower(int base, int exponent){
        double result = 1;

        int positiveExponent = Math.abs(exponent);

        for(int i = 1; i <= positiveExponent; i++){
            result = result * base;
        }

        if(exponent < 0){
            result = 1 / result;
        }

        return result;
    }
}
