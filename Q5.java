package assignment_6;
//A regular polygon is an n-sided polygon in which all sides are of the same length and all angles
//have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for
//computing the area of a regular polygon is

//Write a method that returns the area of a regular polygon using the following header:
//public static double area(int n, double side)

import java.util.*;

public class Q5 {
    double area (int x , double y ){
        double area = ((x*y*y)/(4*Math.tan(Math.PI/x)));
        return area;
    }

    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        Q5 call = new Q5();
        System.out.println("Enter the number of sides of the regular polygon : ");
        int side = sc.nextInt();
        System.out.println("Enter the number of sides of the regular polygon : ");
        double length = sc.nextDouble();

        double area = call.area(side,length);
        System.out.println("Area of the polygon of side : " + side + " and side length : " + length + " is : " + area);
    }
}
