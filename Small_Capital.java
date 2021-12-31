package com.company;
import java.util.Scanner;

public class Small_Capital {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a letter: ");
        char ch = in.next().charAt(0);

        if (Character.isUpperCase(ch))
            System.out.println(ch+" is capital letter!");
        else if (Character.isLowerCase(ch))
            System.out.println(ch+" is small letter!");
        else
            System.out.println(ch +" is not an alphabet!");
    }
}
