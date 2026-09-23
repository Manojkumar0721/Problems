package com.programs.first_java;

import java.util.Scanner;

public class PrincipleTimeRate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Interest calculator.");

        System.out.print("Enter the principle amount (P): ");
        double principle = scanner.nextDouble();

        System.out.print("Enter the Annual Interest in % (R): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time in year: ");
        double time = scanner.nextDouble();

        double interest = (principle * rate * time) / 100;

        double totalAmount = principle + interest;

        System.out.println("===Calculation Result===");
        System.out.println("Simple intrest Earned/owned: " + interest);
        System.out.println("Total Amount: " + totalAmount);

    }
}
