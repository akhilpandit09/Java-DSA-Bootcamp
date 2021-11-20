package com.second;
//Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name;
        name=input.nextLine();
        System.out.println("Hello "+ name+" welcome to our channel");
    }
}
