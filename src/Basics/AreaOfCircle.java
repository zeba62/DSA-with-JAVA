package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        //Area 3.14*r*r
        System.out.println("Hello Zeba");
        double r;
        double area;
        System.out.print("Enter radius of a circle :");
        Scanner sc= new Scanner(System.in);
        r= sc.nextDouble();
        area= (3.14 * r* r);
        System.out.println("Area of circle is : "+ area);


    }
}
