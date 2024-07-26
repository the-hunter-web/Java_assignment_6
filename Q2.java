package assignment_6;
import java.util.*;
public class Q2 {
    int getPentagonalNumber(int n) {
        return ((int)((n*(3*n-1))/2));
    }
    public static void main (String [] args ) {
//        A pentagonal number is defined as n (3n–1)/2 for n = 1, 2, . . ., and so on. Therefore, the first
//        few numbers are 1, 5, 12, 22, . . . .
//        Write a method with the following header that returns a pentagonal number:
//        public static int getPentagonalNumber(int n)

        Scanner sc = new Scanner(System.in);
        Q2 call = new Q2();

        for (int i = 1 ; i <101 ; i++) {
            System.out.print(call.getPentagonalNumber(i ) + " ");
            if (i%10 == 0)
                System.out.println();
        }

    }
}
