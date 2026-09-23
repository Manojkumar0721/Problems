package com.programs.basic;

import java.util.Scanner;

public class LargestUntilZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (type 0 to quit): ");
        int userInput = sc.nextInt();

        int largest = userInput;

        while(userInput != 0){
            if(userInput > largest){
                largest = userInput;
            }
            System.out.print("Enter a next digit: ");
            userInput = sc.nextInt();
        }
        System.out.println("Largest: " + largest);
    }

}
