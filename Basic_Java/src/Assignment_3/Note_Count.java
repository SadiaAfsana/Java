package Assignment_3;
//5. Find the number of notes from input amount in given array [1000,500,100,50,20,10,5,2]

import java.util.Scanner;

public class Note_Count {

    public static void main(String[] args) {
        int[] myArray = {1000, 500, 100, 50, 20, 10, 5, 2};
        System.out.println("Enter Amount (Tk): ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        notes(amount, myArray);
    }

    public static void notes(int amount, int[] array) {

        int[] noteCount = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (amount >= array[i]) {
                noteCount[i] = amount / array[i];
                amount = amount - noteCount[i] * array[i];
            }
        }

        System.out.println("Notes Required -");
        for (int i = 0; i < array.length; i++) {
            if (noteCount[i] != 0) System.out.println(array[i] + "Tk : " + noteCount[i]);
        }
    }
}
