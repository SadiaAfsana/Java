package com.company;

import java.util.Scanner;
//5.Write a program to calculate CGPA and find grade

public class Cgpa_Grade {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Course 1 GPA: ");
        double g1 = in.nextDouble();
        System.out.print("Enter Course 2 GPA: ");
        double g2 = in.nextDouble();
        System.out.print("Enter Course 3 GPA: ");
        double g3 = in.nextDouble();

        double Cgpa = (g1 + g2 + g3) / 3;
        System.out.format("Your Cgpa is : %.2f", Cgpa);
        System.out.println("");

        if (Cgpa >= 3.8)
            System.out.println("Excellent: Grade A");
        else if (Cgpa < 3.79 && Cgpa >= 3.5)
            System.out.println("Good: Grade B");
        else if (Cgpa < 3.49 && Cgpa >= 3.0)
            System.out.println("Poor: Grade C");
        else
            System.out.println("Failed!");
    }
}
