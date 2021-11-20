package com.first;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,end,i;
        System.out.println("\n Enter a number of multiplication:");
        num=input.nextInt();
        System.out.println("\n Enter a number to repeat:");
        end=input.nextInt();
        for(i=1;i<=end;++i) {
            System.out.println(num + " * "+ i +" = " + num*i);
        }
    }
}
