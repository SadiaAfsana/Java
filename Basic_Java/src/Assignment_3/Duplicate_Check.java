package Assignment_3;
//2. Write a program to find if any element is duplicate. If duplicate, show the value.

import java.util.Scanner;

public class Duplicate_Check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        dup(array);
    }

    public static void dup(int[] array) {
        boolean isExist = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate value: " + array[j]);
                    isExist = true;
                }
            }
        }
        if (isExist == false) System.out.println("No Duplicates");
    }

}