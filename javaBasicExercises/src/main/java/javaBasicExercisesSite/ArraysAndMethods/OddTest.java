package javaBasicExercisesSite.ArraysAndMethods;

import java.util.Scanner;

public class OddTest {
    public static void main(String[] args) {
        int number = 0;
        Scanner skaner = new Scanner(System.in);
        System.out.println("Enter a number to check");
        number = skaner.nextInt();
    if (isOdd(number)){
        System.out.println("ODD");

    }else {
        System.out.println("EVEN");
    }
    }

    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
        return true;
        }else {return false;}
    }

}
