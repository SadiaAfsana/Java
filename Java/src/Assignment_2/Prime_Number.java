package Assignment_2;
// Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input]

import java.util.Scanner;

public class Prime_Number {
    public static void main(String arg[]) {
        int num = 0, i = 2;
        System.out.print("Enter n value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime numbers from 2 to " + n + " are ");

        while (i < n) {
            int j = 1, count = 0;
            while (j <= i) {
                if (i % j == 0)
                    count++;
                j++;
            }
            if (count == 2) {
                System.out.printf("%d ", i);
                num++;
            }
            i++;
        }
    }
}