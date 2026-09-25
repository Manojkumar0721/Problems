package com.programs.intermediate;

import java.util.Scanner;

public class HcfCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers.");
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int result = calculateHcf(a,b);
        System.out.println(result);
    }

    public static int calculateHcf(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
