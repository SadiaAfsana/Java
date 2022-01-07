package Assignment_3;

import java.util.Random;
import java.util.Scanner;

public class Number_Words {
    public static void main(String[] args) {
        System.out.print("Hit Enter to Start");
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();

        while (val.equals("")) {
            val = sc.nextLine();
            Random rand = new Random();
            int number = rand.nextInt(10);
            System.out.println("Number: " + number);
            System.out.print("Number in words: " + numberToWord(number));
        }
    }

    private static String numberToWord(int number) {
        String words = "";
        String unitsArray[] = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten"};

        if (number == 0)
            return "zero";
        if (number > 0)
            words += unitsArray[number];
        return words;
    }
}
