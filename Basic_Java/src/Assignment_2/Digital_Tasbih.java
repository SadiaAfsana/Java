package Assignment_2;

import java.util.Scanner;

//Write a program to make a digital tasbih where the program counts each time user press enter until press 0

public class Digital_Tasbih {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        int count = 0;
        while (val.equals("")) {
            val = sc.nextLine();
            count++;
            if (val == "0")
                break;
        }
        System.out.println(count);
    }
}