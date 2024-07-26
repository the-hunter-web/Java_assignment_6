package assignment_6;
//Write java method called count accepts a string as input and returns the number of vowels in
//it. The method header is given below.
//public static int count(String str)
//        For example, count ("Welcome") returns 2.
import java.util.*;
public class Q7 {
    int count (String s ){
        int count = 0 ;
        for (int i = 0 ; i < s.length() ; i++){
            char x = s.charAt(i);
            if ((x == 'A' ) || (x == 'E' ) || (x == 'I' ) || (x == 'O' ) || (x == 'U' ) )
                count ++;
        }
        return count;
    }
    public static void main (String [] args ) {
        Q7 call = new Q7();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String to check for vowel count : ");
        String str1 = sc.nextLine();
        str1 = str1.toUpperCase();

        System.out.println("String has vowel count : " + call.count(str1));
    }
}
