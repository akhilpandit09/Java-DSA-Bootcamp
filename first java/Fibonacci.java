package com.second;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num,c=0;
        System.out.println("Enter number to generate the Fibonacci series:");
        num=input.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci series upto "+num+" is ");
        while(c<=0){
            System.out.println(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
