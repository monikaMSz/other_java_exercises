package third;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] myArray = {{1, 2, 3}, {21, 7, 4}, {56, 14, -2}};
        int[][] myArray2 = {{1, 2, 4}, {21, 7, 4}, {56, 14, -2}};





        Zadanie1 zad = new Zadanie1();
        System.out.println("Suma elementów podzielnych przez 7: " + zad.addElementsDividedBySev(myArray));

        Zadanie2 zad2 = new Zadanie2();
        System.out.println("Iloczyn elementów wynosi: " + zad2.multiplyElements(myArray));

        Zadanie3 zad3 = new Zadanie3();
        System.out.println("Iloczyn liczb parzystych wynosi: " + zad3.multiplyEvenElements(myArray));

        Zadanie4 zad4 = new Zadanie4();
        System.out.println("Iloczyn liczb nieparzystych wynosi: " + zad4.multiplyOddElements(myArray));

        Zadanie5 zad5 = new Zadanie5();
        System.out.println("Iloczyn liczb podzielnych przez 3 wynosi: " + zad5.multiplyElemDividedByThree(myArray));

        Zadanie6 zad6 = new Zadanie6();
        System.out.println("Najmniejsza liczba to: " + zad6.minElemArray(myArray));

        Zadanie7 zad7 = new Zadanie7();
        System.out.println("Największy element tablicy to: " + zad7.maxElemArray(myArray));

        Zadanie8 zad8 = new Zadanie8();
        int[] arrResult = zad8.sumEvenInRows(myArray);
        for (int i = 0; i < arrResult.length; i++) {
            System.out.println(i + "suma elementów" + arrResult[i]);

        }
        System.out.println("=======================");



        Matrix2D matrix = new Matrix2D();
        matrix.print2DArray(myArray);
        matrix.identityMatrix(myArray);
        System.out.println("================");
        matrix.print2DArray(myArray);
        matrix.indexedMatrix(myArray);
        System.out.println("================");
        matrix.print2DArray(myArray);
        System.out.println(matrix.isEqualDimension(myArray, myArray));
        System.out.println("================");
        int[][] testAr = new int[myArray.length][myArray[0].length];
        testAr = matrix.addMatrix(myArray, myArray);
        printTestArray(testAr);
        System.out.println("=================");
        testAr = matrix.substractMatrix(myArray, myArray);
        printTestArray(testAr);
        System.out.println("==================");
        testAr = matrix.multiplicationMatrix(myArray, 5);
        printTestArray(testAr);
        System.out.println("===============");
        testAr=matrix.transpose(myArray);
        printTestArray(testAr);
        System.out.println(matrix.isSymetric(myArray,myArray2));
    }

    private static void printTestArray(int[][] testAr) {
        for (int i = 0; i < testAr.length; i++) {
            for (int j = 0; j < testAr[i].length; j++) {
                System.out.print(testAr[i][j] + "\t");
            }
            System.out.println();

        }
    }

}


