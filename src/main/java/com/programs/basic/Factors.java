package com.programs.basic;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        factors(n);
        sc.close();
    }

    public static void factors(int n){
        if(n==0){
            System.out.println("Every number is a factor of 0 (except 0).");
            return;
        }

        n = Math.abs(n);

        for(int i = 1; i <= n/2; i++){
            int remainder = n % i;
            if(remainder == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(n + "");
    }
}
