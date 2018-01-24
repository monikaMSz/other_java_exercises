package collectionsJavaExercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SamouczekZad1 {
    //napisz program, który będzie pobierał od uzytkownika imiona.Program powinien pozwilić
    //uzytkownikowi na wporwadzenie dowolnej liczby imion(wporowadzenie "-" jako imienia przerwie wprowadzanie).
    //Na zakonczenie wypisz liczbe unilanych imion.


   // public static final String No_More_Names = "-";

    public static void main(String[] args) {
        String name;
        Set<String> names = new HashSet<>();
        Scanner skaner = new Scanner(System.in);
        do{
            System.out.println("Podaj imię: ");
            name=skaner.next();
            if(!name.equals("-")) {
                names.add(name);
            }
        }while(!name.equals("-"));
        System.out.println("Wprowadziłeś "+ names.size() +" unikalnych imon");

    }
}
