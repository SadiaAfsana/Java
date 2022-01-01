package com.company;
//Create a math quiz program.

import java.util.Random;
import java.util.Scanner;

public class Math_Quiz {
    public static void main(String[] args) {
        Random rand = new Random();
        int score = 0;

        for (int i = 0; i < 5; i++) {
            int num1 = rand.nextInt(10);
            int num2 = rand.nextInt(10);
            System.out.println("First Number: " + num1);
            System.out.println("Second Number: " + num2);
            System.out.print("Enter the sum: ");
            Scanner in = new Scanner(System.in);
            int sum = in.nextInt();

            if (sum == num1 + num2) {
                System.out.println("Answer is correct");
                score++;
            } else System.out.println("Wrong Answer");
        }
        System.out.println("Your Final Score is: " + score);

    }
}
