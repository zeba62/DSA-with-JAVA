package Loops;

import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
//        System.out.print("Enter value for n for calculating n terms for AP series: ");
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=2; i<=3*n-1 ; i+=3){
//            System.out.print(i +" ");
//        }
        System.out.print("Enter value for n for calculating n terms for AP series: ");
        Scanner sc= new Scanner(System.in);
        //int a=-99, d=-4;
        int n=sc.nextInt();
        int term=95;
       for (int i=2;i<=n && term >0;i++){
           System.out.print(term+ " " );
           term-=4;
       }
    }
}
