package PatternPrinting;

import java.util.Scanner;

public class HorizontallyFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //using var instead of math n+1-i
        //int a=n; and loop will goo to for(int j=1;j<=a;j++)
        System.out.println("Enter any number: ");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++) {//or  (int j=n;j>=i;j--) but this is not standard
                System.out.print((char)(i+64)+ " ");//small letter triangle
            }
            //a--;
            System.out.println();
        }
    }
}
