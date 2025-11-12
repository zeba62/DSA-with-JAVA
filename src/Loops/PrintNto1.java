package Loops;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        System.out.print("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
