package Basics;

import java.util.Scanner;

public class FindQuadrant {
    public static void main(String[] args) {
        double x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value for x coordinate: ");
        x=sc.nextDouble();
        System.out.print("Enter value for y coordinate: ");
        y=sc.nextDouble();
        if (x==0 && y ==0){
            System.out.println("point is at origin");
        } else if (x>0 && y>0) {
            System.out.println("First quadrant");
        } else if (x<0 && y>0) {
            System.out.println("Second quadrant");
        } else if (x<0 && y<0) {
            System.out.println("Third quadrant");
        } else if (x>0 && y<0) {
            System.out.println("Fourth quadrant");
        } else {
            System.out.println("Invalid point");
        }
    }
}
