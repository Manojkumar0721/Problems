package com.programs.first_java;

import java.util.Scanner;

public class Fibbo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = input.nextInt();

        int a = 0;
        int b = 1;

        int count = 2;

        while(n>=count){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}
