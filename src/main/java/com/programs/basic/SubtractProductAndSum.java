package com.programs.basic;

import java.util.Scanner;

public class SubtractProductAndSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int finalResult = subtractProductAndSum(num);
        System.out.println(finalResult);
    }

    public static int subtractProductAndSum(int n){
        int product = 1;
        int sum = 0;
        while (n>=1){
            int remainder = n % 10;
            product = product * remainder;
            sum = sum + remainder;
            n = n / 10;
        }
        return product - sum;
    }

}
