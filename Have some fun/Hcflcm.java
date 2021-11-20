package com.first;

import java.util.Scanner;

public class Hcflcm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Enter any two numbers from user:");
        a= input.nextInt();
        b= input.nextInt();

        int num1=a;
        int num2=b;

        while (b!=0)
        {
           int x=b;
            b=b%a;
            a=x;
        }
        int hcf=a;
        int lcm=(num1*num2)/hcf;

        System.out.println("\n HCF("+num1+","+num2+")="+hcf);
        System.out.println("\n LCF("+num1+","+num2+")="+lcm);
    }
}
