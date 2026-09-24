package com.programs.intermediate;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Original price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Discount percentage: ");
        int discountRate = sc.nextInt();
        calculateDiscount(price,discountRate);

    }

    public static void calculateDiscount(double price, int discountRate){
        if(price < 0 || discountRate < 0 || discountRate > 100){
            System.out.println("Invalid input!, " + "Price: " + price + ", " + " discountRate: " + discountRate);
            return;
        }

        double discountAmount = (price * discountRate)/100;
        double finalPrice = price - discountAmount;

        System.out.println("Final price: " + finalPrice + ", " + "Discount Amount: " + discountAmount);

    }
}
