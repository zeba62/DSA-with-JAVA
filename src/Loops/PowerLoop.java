package Loops;

import java.util.Scanner;

public class PowerLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number for a: ");
        int a= sc.nextInt();
        System.out.print("Enter any positive number for b: ");
        int b= sc.nextInt();
        int pow=1;
        for (int i=1; i<=b;i++){
            pow *= a;//pow= pow*a;\
        }
        System.out.println(a+ " raised to the power " +b  + " is " + pow);
    }
}
