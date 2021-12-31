package com.company;
import java.util.Scanner;

//3.Write a program that takes a year from user and print whether that year is a leap year or not

public class Leap_Year {
    public static void main(String[] args){
        System.out.println("Enter a Year : ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");
    }
}
