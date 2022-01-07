package Assignment_3;
//1. Write a program to calculate difference between today and your birthday.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date_Diff {
    public static void main(String[] args) throws ParseException {
        System.out.println("Enter Your Birthday (dd-MM-YYYY): ");
        Scanner input = new Scanner(System.in);
        String Birthday = input.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyy");
        Date date1 = formatter.parse(Birthday);
        Date date2 = new Date();

        Calculate calculate = new Calculate();
        calculate.Age(date1, date2);

    }
}

class Calculate {
    public void Age(Date date1, Date date2) {
        long d = date2.getTime() - date1.getTime();
        long year = d / (1000l * 60 * 60 * 24 * 365);
        long day = d / (1000 * 60 * 60 * 24) % 365;
        System.out.println("You are " + year + " Years and " + day + " Days old.");
    }
}
