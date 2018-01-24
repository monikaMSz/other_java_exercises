package javaBasicExercisesSite.ArraysAndMethods;

import java.util.Scanner;

public class BooleanHasEight {
    public static void main(String[] args) {
        int number;
        int sentinel = -1;

        Scanner skaner = new Scanner(System.in);
        System.out.println("Enter a positive integer or -1 to exit: ");
        number = skaner.nextInt();
        while (number != sentinel) {
            System.out.println("Enter a positive integer or -1 to exit: ");
            number = skaner.nextInt();
            if (hasEight(number)) {
                System.out.println("Magic sum: " );


            }
        }


    }

    public static boolean hasEight(int number) {
        int suma = 0;

        while (number > 0) {
            if (number % 10 == 8) ;
            suma = suma + number;
            number = number / 10;
            return true;

        }
        return false;//nie moge obliczyc sumy poszukac w necie jeszcze po ang popowiedzi
    }
}
