package com.programs.first_java;

import java.util.Scanner;

public class RupeesToUsd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double exchangeRate = 0.010424;

        System.out.print("Enter the amount in rupees: ");
        double rupees = scanner.nextDouble();

        double usd = rupees * exchangeRate;

        System.out.println(rupees + " INR -> " + usd + " USD");
    }
}
