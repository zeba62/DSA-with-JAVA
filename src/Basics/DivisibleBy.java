package Basics;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number: ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        if (n>0){
            if (n%3==0 && n%5==0){
                System.out.println("Number is divisible by both 3 and 5");
            }else if (n%3==0 || n%5==0){
                System.out.println("Number is divisible  by 3 or 5");
            }else {
                System.out.println("Number is not divisible by 3 or 5");
            }
        }else {
            System.out.println("Number is  not a positive");
        }
        sc.close();
    }
}
