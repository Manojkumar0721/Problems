package com.programs.intermediate;

import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Perfect Number Calculator ~~~");
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPerfectNum = calculatePerfectNum(number);
        if(isPerfectNum){
            System.out.println(number + " Perfect Number.");
        }else{
            System.out.println(number + " not a Perfect Number.");
        }
        sc.close();
    }

    public static boolean calculatePerfectNum(int number){
        if(number<=1){
            System.out.println(number + " is not a perfect Number");
            return false;
        }
        int sum = 0;
        for(int i = 1; i <= number/2; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        return sum == number;
    }
}
