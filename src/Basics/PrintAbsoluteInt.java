package Basics;

import java.util.Scanner;

public class PrintAbsoluteInt {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any number : ");
        Scanner sc= new Scanner(System.in) ;
        n= sc.nextInt();
        if (n<=0) n= n*-1;//or n = -n;
        System.out.println(n);
    }
}
