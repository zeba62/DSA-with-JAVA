package Basics;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for 1st side of triangle: ");
        a= sc.nextInt();
        System.out.print("Enter value for 2nd side of triangle: ");
        b= sc.nextInt();
        System.out.print("Enter value for 3rd side of triangle: ");
        c= sc.nextInt();
        if ((a+b)>c && (b+c)>a && (c+a)>b){
            System.out.println("It is a triangle");
        }else {
            System.out.println("It is not a triangle");
        }
    }
}
