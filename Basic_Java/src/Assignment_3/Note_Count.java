package Assignment_3;
//5. Find the number of notes from input amount in given array [1000,500,100,50,20,10,5,2]

import java.util.Scanner;

public class Note_Count {

    public static void notes(int amount) {
        int[] notes = new int[]{1000, 500, 100, 50, 20, 10};
        int[] noteCount = new int[6];

        for (int i = 0; i < 6; i++) {
            if (amount >= notes[i]) {
                noteCount[i] = amount / notes[i];
                amount = amount - noteCount[i] * notes[i];
            }
        }

        System.out.println("Notes Required -");
        for (int i = 0; i < 6; i++) {
            if (noteCount[i] != 0) {
                System.out.println(notes[i] + "Tk : " + noteCount[i]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Amount (Tk): ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        notes(amount);
    }
}
