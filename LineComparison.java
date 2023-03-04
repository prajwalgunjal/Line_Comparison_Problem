package com.bridgelabz;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Line Comparison program.");
        System.out.println("Enter the value of x1");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of X2");
        int x2 = sc.nextInt();
        System.out.println("ENter the value of y1");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of y2:");
        int y2 = sc.nextInt();
        double length = Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("Length of Lines is : "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+length);
    }
}
