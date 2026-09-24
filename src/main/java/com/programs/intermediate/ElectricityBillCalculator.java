package com.programs.intermediate;

import java.util.Scanner;

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
