package com.programs.first_java;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        original = original.toLowerCase();

        String reverse = "";

        for(int i= original.length()-1; i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }

        if(original.equals(reverse)){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not Palindrome!");
        }


    }
}
