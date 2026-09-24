package com.programs.intermediate;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single Character: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);
        if(ch >='a' && ch <= 'z'){
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is Vowel");
                    break;
                default:
                    System.out.println(ch + " is consonant");
            }
        }else{
            System.out.println("Invalid input!");
        }
    }


}
