package com.programs.intermediate;

import java.util.Scanner;

public class CgpaCalculator {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number of Subjects: ");
        int numSubjects = sc.nextInt();
        double totalGrade = calculateCgpa(numSubjects);
        double percentage = totalGrade * 9.5;
        System.out.printf("Your CGPA is %.2f(Equivalent to %.2f%%)\n", totalGrade, percentage);
        sc.close();
    }

    public static double calculateCgpa(int numSubjects){
        if(numSubjects <=0){
            System.out.println("Invalid number of subjects.");
            return 0.0;
        }
        double totalGrade = 0.0;
        for(int i = 1; i<= numSubjects; i++){
            System.out.print("Enter Grade of " + i + " subject: ");
            totalGrade = totalGrade + sc.nextDouble();
        }
        return totalGrade / numSubjects;
    }
}
