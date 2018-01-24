import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        //przy deklaracji tablicy podać ilosć liczb w [];badź w zmiennej zapisać
        Scanner skaner = new Scanner(System.in);

        try {

            System.out.println("Podaj ile liczb wprowadzisz: ");
            int limit = skaner.nextInt();
            int[] liczby = new int[limit];

            for (int i = 0; i < liczby.length; i++) {
                System.out.println("Podaj liczbę: ");
                {
                    liczby[i] = skaner.nextInt();
                }
            }
            for (int elem : liczby
                    ) {
                System.out.print(elem + " ");
            }
            System.out.println();


            srednia(liczby);
        } catch (InputMismatchException e) {
            System.out.println("Podana wartość nie jest liczbą");

        }

    }

    static void srednia(int[] tab) {
        int suma = 0;
        int srednia = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        System.out.println("Srednia wynosi: " + (srednia = suma / tab.length));
    }
}
