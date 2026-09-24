package com.programs.intermediate;

import java.util.Scanner;

public class CommissionRateCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Commission percentage calculator ~~~");
        System.out.print("Enter the total amount of sales: ");
        double sales = sc.nextDouble();
        System.out.print("Enter the actual money earned as commission: ");
        double commission = sc.nextDouble();
        double result = calculateCommission(sales, commission);
        System.out.printf("The commission percentage is %.2f%%\n" , result);
        sc.close();
    }

    public static double calculateCommission(double sales, double commission){
        if(sales > 0){
            return (commission/sales) * 100;
        }else{
            throw new IllegalArgumentException("Sales amount must be greater than zero.");
        }
    }
}
