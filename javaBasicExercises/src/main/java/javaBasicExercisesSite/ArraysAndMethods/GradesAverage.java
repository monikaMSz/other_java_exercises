package javaBasicExercisesSite.ArraysAndMethods;

import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int numStudents = 0;
        int[] grades = new int[numStudents];
        double sum = 0;


        System.out.println("Enter the number of students: ");
        numStudents = skaner.nextInt();
        for (int i = 0; i <= numStudents; i++) {
            System.out.println("Enter the grade for student " + i + ": ");
            int grade = skaner.nextInt();
            sum += grade;
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade,try again...");
                break;
            }
        }double average = sum/numStudents;
        System.out.println("The average is: " + average);
    }

}


