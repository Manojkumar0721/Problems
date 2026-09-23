package com.programs.basic;

import java.util.Scanner;

public class MathematicalCalculations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Geometry Area Calculator ===");
        listOfOperations();
        System.out.print("Select a shape (1-7): ");
        int option = sc.nextInt();

        switch (option) {
            case 1 -> calculateAreaOfCircle();
            case 2 -> calculateAreaOfTriangle();
            case 3 -> calculateAreaOfRectangle();
            case 4 -> calculateAreaOfIsoscelesTriangle();
            case 5 -> calculateAreaOfParallelogram();
            case 6 -> calculateAreaOfRhombus();
            case 7 -> calculateAreaOfEquilateralTriangle();
            default -> System.out.println("Invalid selection! Please run the program again and select 1 to 7.");
        }
    }

    public static void listOfOperations(){
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Area of Triangle");
        System.out.println("3. Calculate Area of Rectangle");
        System.out.println("4. Calculate Area of Isosceles Triangle");
        System.out.println("5. Calculate Area of Parallelogram");
        System.out.println("6. Calculate Area of Rhombus");
        System.out.println("7 Calculate Area of Equilateral Triangle");
    }

    public static void calculateAreaOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate the area of circle mathematical formula Area = pi * r * r");
        System.out.print("Enter a radius of the circle in Centimeters: ");
        double radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + area + "cm²");
        sc.close();
    }

    public static void calculateAreaOfTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate the area of triangle formula Area = (base * height) / 2");
        System.out.print("Enter a base value in Centimeters: ");
        double base = sc.nextDouble();
        System.out.print("Enter a height value in Centimeters: ");
        double height = sc.nextDouble();
        double area = (base * height)/2;
        System.out.println("Area of the triangle is: " + area + "cm²");
        sc.close();
    }

    public static void calculateAreaOfRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate area of rectangle mathematical formula Area = length * width");
        System.out.print("Enter the length of rectangle in centimeter: ");
        int length = sc.nextInt();
        System.out.print("Enter a width of the rectangle in centimeter: ");
        int width = sc.nextInt();
        int area = length * width;
        System.out.println("Area of the rectangle is: " + area + "cm²");
        sc.close();
    }

    public static void calculateAreaOfIsoscelesTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate are of isosceles triangle formula Area = 0.5 * base * height");
        System.out.print("Enter a base of isosceles triangle in centimeter: ");
        int base = sc.nextInt();
        System.out.print("Enter a height of isosceles triangle in centimeter: ");
        int height = sc.nextInt();
        double area =  0.5 * base * height;
        System.out.println("Area of the isosceles triangle is " + area + "cm²");
        sc.close();
    }

    public static void calculateAreaOfParallelogram(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate are of Parallelogram formula Area = base * height");
        System.out.print("Enter a base of Parallelogram in centimeter: ");
        int base = sc.nextInt();
        System.out.println("Enter a height of Parallelogram in centimeter: ");
        int height = sc.nextInt();
        double area = base * height;
        System.out.println("Area of Parallelogram is " + area + "cm²");
        sc.close();
    }

    public static void calculateAreaOfRhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate area of Rhombus formula Area = 0.5 * diagonal1 * diagonal2");
        System.out.print("Enter the length of diagonal 1: ");
        int d1 = sc.nextInt();
        System.out.print("Enter the length of diagonal 2: ");
        int d2 = sc.nextInt();
        double area = 0.5 * d1 * d2;
        System.out.println("Area of Rhombus is " + area + "cm²");
        sc.close();
    }

    public static void calculateAreaOfEquilateralTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate the area of Equilateral Triangle formula Area = (sqrt(3) / 4) * side^2");
        System.out.print("Enter the side length of the equilateral triangle in centimeter: ");
        int side = sc.nextInt();
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println("Area Of Equilateral Triangle is " + area + "cm²");
        sc.close();
    }
}
