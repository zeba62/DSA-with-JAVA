package Basics;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any Number: ");
        double n = sc.nextDouble();
        int x= (int)n;//typecast
        if (n-x>0){
            System.out.println("Not an integer");
        }else {
            System.out.println("It is an integer");
        }
    }
}
