package com.second;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
//import java.io.InputStreamReader;
public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter any two numbers:");
            float x = input.nextFloat();
            float y = input.nextFloat();
            System.out.println("\nChoose the operation to perform (+,-,*,/)");
            char ch = input.next().charAt(0);
                if (ch == '+') {
                    float sum = x + y;
                    System.out.println("Sum=" + sum);
                } else if (ch == '-') {
                    float difference = x + y;
                    System.out.println("Difference=" + difference);
                } else if (ch == '*') {
                    float multiply = x * y;
                    System.out.println("Product=" + multiply);
                } else if (ch == '/') {
                    float divide = x / y;
                    System.out.println("Divide=" + divide);
                }

            }
    }


