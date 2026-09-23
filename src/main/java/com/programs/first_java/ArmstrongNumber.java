package com.programs.first_java;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Let's find out the number is Armstrong Number or not are you ready!");
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        int original = num;
        double result = 0;

        int digits = String.valueOf(num).length();

        while(num != 0){
            int remainder = num % 10;
            result = result + Math.pow(remainder, digits);
            num /= 10;
        }

        if(result == original){
            System.out.println(original + " is Armstrong Number!");
        }else{
            System.out.println(original + " is not Armstrong Number!");
        }

    }
}
