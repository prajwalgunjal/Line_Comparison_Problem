package com.bridgelabz;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // length of line 1
        System.out.println("Welcome to Line Comparison program.");
        System.out.println("Enter the value of x1");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of X2");
        int x2 = sc.nextInt();
        System.out.println("ENter the value of y1");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of y2:");
        int y2 = sc.nextInt();
        double lengthofline1 = Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("Length of Line1 is : "+lengthofline1);

        //length of line 2
        System.out.println("Enter the value of x3:");
        int x3 = sc.nextInt();
        System.out.println("Enter the value of y3:");
        int y3 = sc.nextInt();
        System.out.println("Enter the value of x4:");
        int x4 =sc.nextInt();
        System.out.println("Enter the value of y4:");
        int y4 = sc.nextInt();
        double lengthofline2 = Math.sqrt((x3^2-x4^2)+(y3^2-y4^2));
        System.out.println("length of line 2 is : "+lengthofline2);
        if(lengthofline1==lengthofline2)
        {
            System.out.println("Both lines are equal");
        }
        else
        {
            System.out.println("lines are not equal");
        }
        if(lengthofline1<lengthofline2)
        {
            System.out.println("line 2 is greater than line 1");
        }
        else {
            System.out.println("line 1 is greater than line 2");
        }
    }
}
