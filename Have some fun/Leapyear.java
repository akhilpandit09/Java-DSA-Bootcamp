package com.first;
import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {
	// write your code here
                Scanner input = new Scanner(System.in);
                int year = input.nextInt();
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + " Leap year");
                } else {
                    System.out.println(year + " Not leap year");
                }
    }
}
