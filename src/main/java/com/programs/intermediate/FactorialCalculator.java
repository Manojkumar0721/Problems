package com.programs.intermediate;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = sc.nextInt();
        long result = calculateFactorial(userInput);
        System.out.println(result);

    }

    public static long calculateFactorial(int n){
        long fact = 1;

        for(int i = 1; i <=n; i++){
            fact = fact * i;
        }

        return fact;
    }
}
