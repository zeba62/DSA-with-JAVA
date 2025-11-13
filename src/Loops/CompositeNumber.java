package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();

        for (int i=2;i<=n-1;i++){
            if (n%i==0){//means 'i' is a factor of 'n'
                System.out.println("Number is Composite");
                break;//loop here breaks only and permanently
            }

        }
    }
}
