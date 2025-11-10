package Basics;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        int cp,sp,profit,loss;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price for an item: ");
        cp= sc.nextInt();
        System.out.print("Enter selling price for an item: ");
        sp= sc.nextInt();
        if (sp>cp){
            profit= sp-cp;
            System.out.println("There is profit of : " + profit);
        } else if (sp==cp) {
            System.out.println("There is no profit or loss");
        } else {
            loss=cp-sp;
            System.out.println("There is loss of: "+ loss);
        }
    }
}
