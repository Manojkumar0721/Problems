package com.programs.intermediate;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Leap Year Checker ~~~");
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeapYear = checkLeapYear(year);
        if(isLeapYear){
            System.out.println(year + " is Leap year.");
        }else{
            System.out.println(year + " is not Leap year.");
        }
        sc.close();
    }

    public static boolean checkLeapYear(int year){
        if(year <= 0){
            throw new IllegalArgumentException("Year cannot be negative please enter some valid year.");
        }
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
