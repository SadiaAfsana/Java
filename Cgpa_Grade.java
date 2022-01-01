package com.company;

import java.util.Scanner;
//5.Write a program to calculate CGPA and find grade

public class Cgpa_Grade {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sumcch = 0;
        double CGPA = 0, cp = 0;

        System.out.print("Enter No. of Semesters Completed: ");
        int s = in.nextInt();

        for (int j = 1; j <= s; j++) {
            System.out.print("Enter No. of Courses for semester" + j + ":");
            int c = in.nextInt();
            for (int i = 1; i <= c; i++) {
                System.out.print("Enter Course" + i + " Total Credit Hours: ");
                int cch = in.nextInt();
                sumcch = sumcch + cch;
                System.out.print("Enter Courser" + i + " Grade Point: ");
                double cgp = in.nextDouble();
                cp = cp + (cch * cgp);
            }

        }
        CGPA = cp / sumcch;
        System.out.format("Your Cgpa is : %.2f", CGPA);
        System.out.println("");

        if (CGPA >= 3.8)
            System.out.println("Excellent: Grade A");
        else if (CGPA < 3.79 && CGPA >= 3.5)
            System.out.println("Good: Grade A-");
        else if (CGPA < 3.49 && CGPA >= 3.0)
            System.out.println("Poor: Grade B+");
        else
            System.out.println("Average!");
    }
}
