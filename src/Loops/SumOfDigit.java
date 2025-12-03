package Loops;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        //for handling negative num
        if (n<0) n=-n;
        int sum = 0;
        while (n !=0) {
            int c = n % 10;//gives last digit
            sum = sum + c;
            n = n / 10;//removes last digit and gives result as initial values

        }
        System.out.println(sum);

    }
}
