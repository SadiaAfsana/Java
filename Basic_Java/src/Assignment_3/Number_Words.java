package Assignment_3;
/* 4. Write a program to generate random number from 1 to 10 but print by it's alphabetical version. Suppose random number is 3. But it will print Three.
 Each time you will press enter, it will generate new random numbers from 1-10 and will show its alphabetical version.*/

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
            int number = rand.nextInt(11);
            System.out.println("Number: " + number);
            System.out.print("Number in words: " + numberToWord(number));
        }
    }

    private static String numberToWord(int number) {
        String words = "";
        String wordsArray[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        if (number == 0) return "zero";
        if (number > 0) words += wordsArray[number];
        return words;
    }
}
