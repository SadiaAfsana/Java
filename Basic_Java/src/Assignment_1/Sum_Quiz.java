package Assignment_1;

import java.util.Random;
import java.util.Scanner;

//7.Write a program to sum of random numbers

public class Sum_Quiz {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.print("Enter the sum: ");
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();

        System.out.println(num1 + num2 == sum ? "Correct!" : "Wrong!");


    }
}
