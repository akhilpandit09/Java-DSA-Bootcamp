package com.first;

import java.util.Scanner;

//Take two numbers and print the sum of both.
public class sum {
    public static void main(String[] args) {
        int x,y;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any two number:");
        x=input.nextInt();
        y= input.nextInt();
        int sum=x+y;
        System.out.println("Sum of given two numbers:"+sum);
    }
}
