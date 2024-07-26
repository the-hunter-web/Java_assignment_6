package assignment_6;
//Write a method that finds the number of occurrences of a specified character in a string using
//the following header:
//public static int count(String str, char a)

import java.util.*;

public class Q6 {
    int count (String a , char b) {
        int count = 0 ;
        for (int i = 0 ; i < a.length() ; i++ ){
//            char x = a.charAt(i);
            if (a.charAt(i) == b)
                count = count + 1;
            else
                count = count;
        }
        return count;
    }
    public static void main (String [] args ) {
        Q6 call = new Q6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the character : ");
        char c = sc.next().charAt(0);
        int count = call.count(str1 , c);
        System.out.println("In the string : " + str1 + " the char '"+ c + "' appears " + count + " time(s) .");
    }
}
