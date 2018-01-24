package javaBasicExercisesSite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args)
            throws FileNotFoundException {

        int number1;
        double number2;
        String name;
        double sum;

        Scanner in = new Scanner(new File("in.txt"));
        number1 = in.nextInt();
        number2=in.nextDouble();
        name = in.next();
        sum=number1 + number2;
        System.out.println("The integer read is: " + number1 + "\n" + "The floating point number read is: " + number2 +"\n"+
                " Thr String read is: " + name + "\n" + "Hi! Peter, the sum of 12 and 33.44 is " + sum);

        in.close();
    }//nie działa? wyskakuje wyjątek, ze nie może znaleźć file in.txt
}


