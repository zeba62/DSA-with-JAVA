package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows= sc.nextInt();
        System.out.println("Enter number of columns: ");
        int columns= sc.nextInt();

        for (int i=1;i<=rows;i++) {//number of lines
            for (int j = 1; j <=columns; j++) {//stars in each line
                System.out.print("* ");
            }
            System.out.println();//next line
        }
    }
}
