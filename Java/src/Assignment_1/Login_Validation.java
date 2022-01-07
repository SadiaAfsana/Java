package Assignment_1;

import java.util.Scanner;

//6.Write a program to check if the provided user credentials are valid during login

public class Login_Validation {
    public static void main(String[] args) {
        String UserName = "Sadia_Afsana";
        String Password = "Sadia123#@";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter UserName: ");
        String u = in.next();

        System.out.print("Enter Password: ");
        String p = in.next();

        System.out.println(u.equals(UserName) && p.equals(Password) ? "Login Successful!" : "Login Failed!");
    }
}
