package assignment_6;
import java.util.*;
public class Q1 {
    double additionSimple(double x, double y){
        return x + y ;
    }
    double subtractionSimple(double x, double y){
        return x - y ;
    }
    double multiplicationSimple(double x, double y){
        return x * y ;
    }
    double divisionSimple(double x, double y){
        return y / x ;
    }
    double remainderSimple(double x, double y){
        return y % x ;
    }
    double squareRootSimple(double x){
        return Math.pow(x,1.0/2);
    }

    public static void main (String [] args ){
//        Design a Simple Calculator using methods in java containing the following functionalities,
//        namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root.
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first operand : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second operand : ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operator : ");
        char oper = sc.next().charAt(0);

        Q1 call = new Q1();

        switch (oper) {
            case '+' :
                System.out.println(call.additionSimple(num1 , num2));
                break;
            case '-' :
                System.out.println(call.subtractionSimple(num1 , num2));
                break;
            case '/' :
                System.out.println(call.divisionSimple(num1 , num2));
                break;
            case '*' :
                System.out.println(call.multiplicationSimple(num1 , num2));
                break;
            case '%' :
                System.out.println(call.remainderSimple(num1 , num2));
                break;
            case 'R' :
                System.out.println(call.squareRootSimple(num1));
                break;
            default :
                System.out.println("Please choose a valid operator !!");
        }
    }
}
