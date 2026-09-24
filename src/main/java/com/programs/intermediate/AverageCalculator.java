package com.programs.intermediate;

import java.util.Scanner;

public class AverageCalculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("How many numbers do you want to average please enter: ");
        int num = sc.nextInt();
        double result = calculateAverage(num);
        System.out.println("Average: " + result);
        sc.close();
    }

    public static double calculateAverage(int n){
        if(n<=0){
            System.out.println("Invalid input! please insert valid number.");
            return 0;
        }
        double sum = 0;

        for(int i = 1; i<=n; i++){
            System.out.print("Enter the number " + i + ": ");
            int userInput = sc.nextInt();
            sum += userInput;
        }
        return sum / n;
    }
}
