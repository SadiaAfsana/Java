package com.company;
import java.util.Scanner;

//Write a program to sum of digits of a number by taking from user input

public class Digits_Sum {
    public static void main(String[] args) {
        int sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for (sum = 0; num != 0; num = num / 10)
            sum = sum + num % 10;
        System.out.println("Sum of digits: " + sum);
    }
}
