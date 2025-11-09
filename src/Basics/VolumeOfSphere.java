package Basics;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        double r, volume;
        System.out.print("Enter radius of sphere: ");
        Scanner sc= new Scanner(System.in);
        r= sc.nextInt();
        volume= ((double) 4/3 * 3.14 * r * r * r);
        System.out.println("Volume of Sphere is: " + volume);
    }
}
