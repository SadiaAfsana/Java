package Assignment_1;

import java.util.Scanner;

// 1.Write a program to get a number from the user and print whether it is positive or negative.

public class Positive_Negative {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();

        if (number > 0) System.out.println(number + " is positive");
        else if (number < 0) System.out.println(number + " is negative");
        else System.out.println(number + " is Zero");
    }

}
