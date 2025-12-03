package PatternPrinting;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++) {//number of lines
            for (int j = 1; j <=n; j++) {//stars in each line
                System.out.print("* ");
            }
            System.out.println();//next line
        }
    }
}
