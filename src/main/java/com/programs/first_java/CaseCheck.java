package com.programs.first_java;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().trim().charAt(0);

        if(ch >= 'a' && ch <='z'){
            System.out.println("LowerCase!");
        }else{
            System.out.println("UpperCase");
        }
    }
}
