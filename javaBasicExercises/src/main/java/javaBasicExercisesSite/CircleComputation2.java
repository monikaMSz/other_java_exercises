package javaBasicExercisesSite;

import java.util.Scanner;

public class CircleComputation2 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        double radius;
        System.out.println("Enter a positive number or - 1 to exit: ");
        radius = skaner.nextDouble();

        while (radius != -1) {
            System.out.println("Radius is: " + radius);

            System.out.println("The area is: " + area(radius));
            System.out.println("The circ is: " + circ(radius));
            System.out.println("Enter a positive number or -1 to exit: ");
            radius = skaner.nextDouble();
        }
    }

    public static double area(double r) {
        return Math.PI * (r * r);
    }

    public static double circ(double r) {
        return 2 *( Math.PI * r);
    }
}
