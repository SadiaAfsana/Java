package com.company;

import java.util.Random;
import java.util.Scanner;

public class Sum_Quiz {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);

        System.out.println("First Number: "+num1);
        System.out.println("Second Number: "+num2);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sum: ");
        int sum = in.nextInt();

        System.out.println(num1 + num2 == sum? "Correct!" : "Wrong!");



    }
}
