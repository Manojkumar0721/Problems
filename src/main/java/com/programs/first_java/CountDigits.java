package com.programs.first_java;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter a digit do you want to count5656: ");
        int digit = scanner.nextInt();

        int count = 0;

        while(number > 0){
            int rem = number % 10;
            if(rem == digit){
                count++;
            }
            number = number / 10;
        }

        System.out.println(count);
    }
}
