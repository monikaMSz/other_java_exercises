import java.util.InputMismatchException;
import java.util.Scanner;

public class Iloczyn {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int input;
        try {

            System.out.println("Podaj ile liczb wprowadzisz: ");
            int limit = skaner.nextInt();
            int[] liczby = new int[limit];


            for (int i = 0; i < liczby.length; i++) {
//              if ((input = skaner.nextInt()) == 0){
//                    continue;
//                }

                    System.out.println("Podaj liczbę: ");
                {
                    {
                        liczby[i] = skaner.nextInt();

                    }
                }


            }
            for (int elem : liczby
                    ) {
                System.out.print(elem + " ");


            }
            System.out.println();

            iloczyn(liczby);

        } catch (InputMismatchException e) {
            System.out.println("Podana wartość nie jest liczbą");
        }

    }

    public static void iloczyn(int[] tab) {
        int iloczyn = 1;
        for (int i = 0; i < tab.length; i++) {
            iloczyn = iloczyn * tab[i];
        }
        System.out.println("Iloczyn = " + iloczyn);

    }
}
