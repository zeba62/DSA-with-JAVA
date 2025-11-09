package Basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        double principal, rate, simpleInterest;
        int time;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        principal= sc.nextDouble();
        System.out.println("Enter rate: ");
        rate= sc.nextDouble();
        System.out.println("Enter time in years: ");
        time= sc.nextInt();
        simpleInterest= principal*rate*time/100;
        System.out.println("Simple interest for "+ time +" Years is: " + simpleInterest);
        System.out.println("Modulus of 10%5 is : "+ 56%3 );
    }
}
