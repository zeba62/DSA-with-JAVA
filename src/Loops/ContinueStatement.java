package Loops;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i=1;i<=20;i++){//I want to print good morning with each number except 13
            System.out.println(i+ " ");
            if (i==13) continue;
            System.out.println("Good Morning");
        }
    }
}
