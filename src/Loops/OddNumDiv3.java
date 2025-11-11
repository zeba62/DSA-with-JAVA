package Loops;

public class OddNumDiv3 {
    public static void main(String[] args) {
        for (int i=1; i<=100;i++){
            if (i%3==0) {
                if(!(i % 2 == 0)) {
                    System.out.println("Odd number divisible by 3 is: " + i);
                }
            }
        }
    }
}
