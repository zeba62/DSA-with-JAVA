package Basics;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a's value: ");
        int a= sc.nextInt();
        System.out.print("Enter b's value: ");
        int b= sc.nextInt();
        System.out.print("Enter c's value: ");
        int c= sc.nextInt();
        if (a>=b && a>=c){
            System.out.println("a is greater than b and c");
        }else if (b>=a && b>=c){
            System.out.println("b is greater than a and c");
        }else {
            System.out.println("c is greater than a and b");
        }

    }
}
