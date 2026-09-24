package com.programs.intermediate;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String input = sc.nextLine();
        String result = reverse(input);
        System.out.println("Output: " + result);
        sc.close();
    }

    public static String reverse(String input){
        int length = String.valueOf(input).length();
        String reversedInput = "";
        for(int i=length-1;i >=0;i--){
            reversedInput = reversedInput + input.charAt(i);
        }
        return reversedInput;
    }
}
