package javaBasicExercisesSite;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius: ");
        radius = skaner.nextDouble();
        System.out.println("The area is: " + area(radius));
        System.out.println("The circ is: " + circ(radius));

    }
    public static double area (double r){
        return Math.PI * r *r;
    }
    public static double circ(double r){
        return 2*Math.PI * r;
    }
}
