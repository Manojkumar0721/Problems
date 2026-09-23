package com.programs.first_java;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = scanner.nextInt();

        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        System.out.println(max + " is the largest number.");
    }
}
