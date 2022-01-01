package com.company;

import java.util.Scanner;
//5.Write a program to calculate CGPA and find grade

public class Cgpa_Grade {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double Cgpa = 0;
        System.out.print("Enter No. of semesters: ");
        int s = in.nextInt();

        for (int i = 1; i <= s; i++) {
            System.out.print("Enter Semester" + i + " GPA: ");
            double g1 = in.nextDouble();
            Cgpa = Cgpa + g1;
        }

        System.out.format("Your Cgpa is : %.2f", Cgpa / s);
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
