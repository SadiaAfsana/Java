package Assignment_1;

import java.util.Scanner;

//3.Write a program that takes a year from user and print whether that year is a leap year or not

public class Leap_Year {
    public static void main(String[] args) {
        System.out.println("Enter a Year : ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        System.out.println(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? "It is a leap year" : "It is not a leap year");
    }
}
