package assignment_6;
import java.util.*;
//Write the methods with the following headers
//// Return the reversal of an integer. Example: reverse (456), returns 654
//public static int reverse(int number)
//// Return true if number is a palindrome
//public static boolean isPalindrome(int number)
//Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is
//the same as itself. Write a java program that prompts the user to enter an integer and reports
//whether the integer is a palindrome.
public class Q3 {
    int rev (int a ) {
        String rev = "";
        for (a = a ; a != 0 ; a = a/10 ){
            rev = rev + (a%10);
        }
        int num = Integer.valueOf(rev);
        return num;
    }
    boolean isPalindrome(int n ){
        if (n == rev(n))
            return true ;
        else
            return false;
    }

    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in);
        Q3 call = new Q3();
        System.out.println("Enter a number to check for palindrome : ");
        int num = sc.nextInt();

//        System.out.println(call.rev(num));
        if (call.isPalindrome(num) == true){
            System.out.println("The number " + num + " is a palindrome number ");
        } else {
            System.out.println("The number is not a palindrome ");
        }

    }
}
