package PatternPrinting;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any value in n: ");
        int n= sc.nextInt();
        for (int i=1; i<=n;i++){
            for (int j=1;j<=i;j++){
                if (i%2!=0){
                    System.out.print(j+ " ");//number star
            }else{
                    System.out.print((char) (j+64)+ " ");//number star

                }
            }
            System.out.println();
        }

    }
}
