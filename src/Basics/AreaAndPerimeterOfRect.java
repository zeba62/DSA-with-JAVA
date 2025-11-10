package Basics;

import java.util.Scanner;

public class AreaAndPerimeterOfRect {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double l=sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b=sc.nextDouble();
        double area= l*b;
        double perimeter= 2*(l+b);

        if (area>perimeter){
            System.out.println("Area is greater than perimeter of rectangle");
        }else {
            System.out.println("Area is not greater than perimeter of rectangle");
        }
    }
}
