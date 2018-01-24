package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
        zad8();

    }

    private static void zad8() {
        Zadanie8 zad = new Zadanie8();
        int[] values = {-3, 0, 45, 8, 12, 9, 4};
        System.out.println(zad.countTheDifference(values));
    }

    private static void zad7() {
        Zadanie7 zad = new Zadanie7();
        System.out.println(zad.oprocentowanie(2345.67, 8));
    }

    private static void zad6() {
        Zadanie6 zad = new Zadanie6();
        System.out.println(zad.squares(7));
        System.out.println(zad.squares(45));
        System.out.println(zad.squares(-45));
    }

    private static void zad5() {
        Zadanie5 zad = new Zadanie5();
        zad.showOddsAndEvens(3, 189);
        zad.showOddsAndEvens(1, 10);
    }

    private static void zad4() {
        Zadanie4 zad = new Zadanie4();
        System.out.println(zad.getSeconds(3, 56, 23));
        System.out.println(zad.getSeconds(435643445, 1222, 3423));
    }

    private static void zad3() {
        Zadanie3 zad = new Zadanie3();
        System.out.println(zad.getMonth(5));
        System.out.println(zad.getMonth(34));
    }

    private static void zad2() {
        Zadanie2 zad = new Zadanie2();
        zad.getDayOfTheWeek(5);
        zad.getDayOfTheWeekTwo(9);
    }

    private static void zad1() {
        Zadanie1 zad = new Zadanie1();
        System.out.println(zad.abs(5));
        System.out.println(zad.abs(-243));
    }

}
