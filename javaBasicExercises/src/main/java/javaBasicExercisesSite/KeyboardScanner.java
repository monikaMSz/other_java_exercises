package javaBasicExercisesSite;

import java.util.Scanner;

public class KeyboardScanner {
    public static void main(String[] args) {
        int number;
        double numebr;
        String name;
        double sum;

        Scanner skaner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        number = skaner.nextInt();
        System.out.println("Enter a floating point number: ");
        numebr = skaner.nextDouble();
        System.out.println("Enter your name: ");
        name = skaner.next();


        sum=number+numebr;
        System.out.println("Hi! Peter, the sum of 12 and 33.44 is: " + sum);
    }

}
