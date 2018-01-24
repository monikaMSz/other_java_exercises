package collectionsJavaExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SamouczekZad2 {

    //Napisz program, który będzie pobierał od użytkownika imiona par dopóki nie wprowadzi
    //imienia "-",następnie poproś użytkownika o podanie jednego z wcześniej wprowadzonych
    //imion i wyświetl imię odpowiadającego mu partnera.
    public static void main(String[] args) {
        Map<String,String> pary = new HashMap<>();
        Scanner skaner = new Scanner(System.in);
        String name1;
        String name2;

        while(true){
            System.out.println("Podaj imię partnera: ");
            name1=skaner.next();
            if(name1.equals("-")){
                break;
            }
            System.out.println("Podaj imię partnerki: ");
            name2 = skaner.next();
            if (name2.equals("-")){
                break;
            }
            pary.put(name1,name2);
        }
        System.out.println("Podaj imię partnera do sprwadzenia: ");
        name1=skaner.next();
        System.out.println("Partnerka dla " + name1 + "to" + pary.get(name1));
    }
}
