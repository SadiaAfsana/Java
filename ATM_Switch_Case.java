package com.company;
import java.util.Scanner;
//8.Write a program to check balance and withdraw money from ATM booth using switch case
public class ATM_Switch_Case {
    public static void main(String[] args) {
        double Balance = 10000.57;
        Scanner in = new Scanner(System.in);
        System.out.println("To Check balance press 1 & To withdraw money press 2");
        int input = in.nextInt();

        switch (input)
        {
            case 1:
                System.out.println("Your Balance is: "+Balance);
                break;
            case 2:
                System.out.println("Please Enter Withdrawal Amount: ");
                double input1 = in.nextDouble();
                System.out.println("Withdrawal successful!");
                System.out.println("Your Current Balance is: "+(Balance-input1));
                break;

            default:
                System.out.println("Please Enter 1 or 2");
        }
    }
}
