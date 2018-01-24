import java.util.Scanner;

public class Cwiczenia {
    public static void main(String[] args) {
        //Zadanie 1
        System.out.println("****************************");
        System.out.println();
        System.out.println("    Java jest super!");
        System.out.println();
        System.out.println("*****************************");

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        double liczba = sc.nextDouble();
        obliczSzescian(liczba);
        System.out.println(obliczSzescian(liczba));

        //Zadanie 3
        System.out.println("Podaj liczbę: ");
        int liczbaPodana = sc.nextInt();
        for (int i = 0; i < liczbaPodana; i++) {
            if (i % 2 == 1) {
                System.out.println(i);


            }
        }
        int num = 20;

        FizzBuzz(num);
    }

    //Zadanie 2
    public static double obliczSzescian(double a) {
        return 6 * (a * a);
    }

    //Zadanie 4
    public static void FizzBuzz(int a) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

}
