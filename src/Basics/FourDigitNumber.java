package Basics;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (n>999 && n<10000){
            System.out.println("Number is four digit");
        }else {
            System.out.println("Number is not a four digit");
        }

    }
}
