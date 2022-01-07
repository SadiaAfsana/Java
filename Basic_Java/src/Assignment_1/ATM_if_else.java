package Assignment_1;

import java.util.Scanner;
//8.Write a program to check balance and withdraw money from ATM booth using if else

public class ATM_if_else {

    public static void main(String[] args) {
        double Balance = 10000.57;

        Scanner in = new Scanner(System.in);
        System.out.println("To Check balance press 1 & To withdraw money press 2");
        int input = in.nextInt();

        if (input == 1)
            System.out.println("Your Balance is: " + Balance);
        else if (input == 2) {
            System.out.println("Please Enter Withdrawal Amount: ");
            double input1 = in.nextDouble();
            System.out.println("Withdrawal successful!");
            System.out.println("Your Current Balance is: " + (Balance - input1));
        } else
            System.out.println("Please Enter 1 or 2");

    }
}

