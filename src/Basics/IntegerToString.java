package Basics;

import java.util.Scanner;

//You are given an integer n , you have to convert it into a string.
//Please complete the partially completed code in the editor.
// If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".
// can range between   -100 to 100 to  inclusive.
public class IntegerToString {
    public static void main(String[] args) {
        String s;
        int n;
        System.out.print("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        s= Integer.toString(n);
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }

    }
}
