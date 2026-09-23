package com.programs.first_java;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        if(n <= 1){
            System.out.print("Neither prime nor composite");
            return;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                System.out.println("Not a prime number!");
                return;
            }
            c++;
        }

        if(c * c >= n){
            System.out.println("Prime number!");
            return;
        }

    }
}
