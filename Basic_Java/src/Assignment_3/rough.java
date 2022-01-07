package Assignment_3;

import java.util.Scanner;

public class rough {
    public static void notes(int amount)
    {
        int[] notes = new int[]{ 1000, 500, 100, 50, 20, 10};
        int[] noteCounter = new int[6];

        for (int i = 0; i < 6; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        System.out.println("Notes Required :");
        for (int i = 0; i < 6; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Amount: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        notes(amount);
    }
}