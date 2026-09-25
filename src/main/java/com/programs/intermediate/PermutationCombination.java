package com.programs.intermediate;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Permutations (nPr) and Combinations (nCr) ~~~");
        System.out.print("Enter the Total number of items (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the number of items being chosen (r): ");
        int r = sc.nextInt();
        System.out.println("-Choose option (1) for permutation.");
        System.out.println("-Choose option (2) for combination.");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                long nPrResult = nPr(n, r);
                System.out.println("nPr: " + nPrResult);
                break;
            case 2:
                long nCrResult = nCr(n, r);
                System.out.println("nCr: " + nCrResult);
                break;
            default:
                System.out.println("Invalid option!");
        }
        sc.close();
    }

    public static long nPr(int n, int r){
        if(n < 0 || r < 0 || r > n){
            throw new IllegalArgumentException("Invalid input!, n and r can't be negative and cannot be grater than n");
        }
        return calculateFactorial(n) / calculateFactorial((n-r));
    }

    public static long nCr(int n, int r){
        if(n < 0 || r < 0 || r > n){
            throw new IllegalArgumentException("Invalid input!, n and r can't be negative and cannot be grater than n");
        }
        return calculateFactorial(n)/ ((long) calculateFactorial(r) * calculateFactorial(n-r));
    }


    public static long calculateFactorial(int number){
        long result = 1;
        for(int i=1;i<=number;i++){
            result = result * i;
        }
        return result;
    }

}
