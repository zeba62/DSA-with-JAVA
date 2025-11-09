package Basics;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any integer: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n <0) {
            System.out.println("Number is not an positive integer");
        } else {
           /* if (n % 2 == 0) {
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is Odd");
            }*/

            if(n%5==0){
                System.out.println("Number is divisible by 5");
            } else {
                System.out.println("Number is not divisible by 5");
            }
        }
    }
}
