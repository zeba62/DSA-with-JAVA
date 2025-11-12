package Loops;

import java.util.Scanner;

public class PrintSequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n= sc.nextInt();
            for (int i = 1,j=n; i <=n; i++,j--) {
                System.out.println(i);
                System.out.println(j);

            }

    }
}
