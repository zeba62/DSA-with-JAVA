package Loops;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n= sc.nextInt();
        if (n==0) n=7;

        int count= 0;//0 is  1 digit number
        while (n!=0){
            n= n/10;
           // System.out.println(n);
            count++;
        }
        System.out.print(count);

    }
}
