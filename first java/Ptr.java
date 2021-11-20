package com.second;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class Ptr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float p,t,r;
        System.out.println("Enter the principle, time, and rate to calculate simple interest:");
        p=input.nextFloat();
        t=input.nextFloat();
        r=input.nextFloat();
        float simple_interest=(p*t*r)/100;
        System.out.println("Simple Interest= "+simple_interest);
    }
}
