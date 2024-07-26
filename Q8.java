package assignment_6;
//Write a java method to check a string is palindrome or not.
import java.util.*;
public class Q8 {
    String rev(String a){
        String rev = "";
        for (int i = a.length()-1 ; i >= 0 ; i-- ) {
            rev = rev + a.charAt(i);
        }
        return rev;
    }
    boolean palinderome(String a) {
        if (a.equals(rev(a)))
            return true;
        else
            return false;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        Q8 call = new Q8();

        System.out.println("Enter the string :");
        String str1 = sc.nextLine();
//        str1 = str1.toLowerCase();
//        System.out.println(call.rev(str1));

        if (call.palinderome(str1)) {
            System.out.println("The String " + str1 + " is a palindrome String . ");
        } else {
            System.out.println("The String " + str1 + " is not a palindrome String . ");
        }
    }
}
