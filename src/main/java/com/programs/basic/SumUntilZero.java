package com.programs.basic;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbers to sum (type 0 to quit): ");
        int userInput = sc.nextInt();

        int sum = 0;

        while(userInput !=0){
            sum = sum + userInput;
            System.out.print("Enter next digit (type 0 to quit): ");
            userInput = sc.nextInt();
        }

        System.out.println("Total sum: " + sum);
        sc.close();

    }


}
