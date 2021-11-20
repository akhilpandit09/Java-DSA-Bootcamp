package com.second;
//Write a program to print whether a number is even or odd, also take input.
import java.sql.SQLOutput;
import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any positive number:");
        int num=input.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is even number");
        }else
        {
            System.out.println(num+" is odd number");
        }
    }
}
