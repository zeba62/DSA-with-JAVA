package Basics;

import java.util.Scanner;

public class TotalSurfaceAreaOfCuboid {
    public static void main(String[] args) {
        double l, b, h, tsa;
        System.out.println("Enter length, breadth , height of Cuboid : ");
        Scanner sc = new Scanner(System.in);
        l= sc.nextDouble();
        b= sc.nextDouble();
        h= sc.nextDouble();
        double v = l * b + b * h + l * h;
        tsa= 2*v;
        System.out.println("Total Surface area of cuboid is : "+ tsa);
    }
}
