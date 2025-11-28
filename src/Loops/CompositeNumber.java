package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        boolean flag= true;

        //for (int i=2;i<=n-1;i++){ or best method is using flag
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {//means 'i' is a factor of 'n'
                flag = false;
                break;//loop here breaks only and permanently
            }
        }
            if(n==1){
                System.out.println("Number is not prime or composite");
            }
            else{
                if (flag==false){
                    System.out.println("Number is Composite");
                }
                else System.out.println("Prime number");
            }
    }
}
