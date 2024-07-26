package assignment_6;
import java.util.Scanner;
//Write a method that returns the number of days in a year using the following header:
//public static int numberOfDaysInAYear(int year)
//Write a java program that displays the number of days in year from 2000 to 2020.
public class Q4 {
    int days(int year){
        if ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) {
            return 366;
        }
        else
            return 365;
    }
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        Q4 call = new Q4();

        for (int i = 2000 ; i <= 2025 ; i++) {
            System.out.println("The year : " + i + " has " + call.days(i) + " days");
        }

    }
}
