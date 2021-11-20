package com.second;
//Input currency in rupees and output in USD.
import java.util.Scanner;
public class USD {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter Nepalese rupees:");
        long currency= input.nextLong();
        System.out.println("USD currency is "+currency*(0.0084));
    }
}
