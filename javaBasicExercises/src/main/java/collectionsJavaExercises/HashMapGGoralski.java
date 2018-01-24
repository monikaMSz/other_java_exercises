package collectionsJavaExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapGGoralski {
    public static void main(String[] args) {
        //Tworzę HashMap, której kluczami  iwartościami będą Stringi
        HashMap<String, String> kodony = new HashMap<>();
        //Wprowadzam kilka par klucz-wartość, kluczami są kodony,wartościami aminokwawsy,które kodony kodują
        kodony.put("UUU", "Phe");
        kodony.put("UUC", "Phe");
        kodony.put("UUA", "Leu");
        kodony.put("CUU", "Leu");
        kodony.put("AGG", "Arg");

        //Drukowanie zawartości mapy
        System.out.println("kodony" + kodony);

        //Pobieranie wartości odpowiadającej kluczowi "UUA"
        System.out.println("UUA znaczy " + kodony.get("UUA"));

        //Możemy zmodyfikować wartość przypisaną do klucza, jeśli klucza nie ma zostanie dołaczona nowa para
        kodony.put("UUA", "błędny kodon");
        System.out.println("kodony " + kodony);

        //jak wyżej, ale jeśli nie ma klucza para nie zostanie dołączona
        kodony.replace("AAA", "Lys");
        System.out.println("kodonyu " + kodony);

        //usuwanie
        kodony.remove("UUA");
        System.out.println("kodony " + kodony);

        //sprawdzamy, czy mapa zawiera dany klucz
        System.out.println("czy mapa zawiera klucz\"UUA\"? " + kodony.containsKey("UUA"));

        //sprawdzamy, czy mapa zawiera daną wartość
        System.out.println("czy mapa zaweira wartosć \"Leu\"? "+ kodony.containsValue("Leu"));

        //Teraz spróbujemy pobrać kolejne pary klucz-wartość. Poniewaz Map nie implementuje interfejsu Iterable,
        //nie możemy bezpośrednio użyć pętli foreach, ale mozna to obejść

        //Tworzymy kolekcje typu Set przechowujące obiekty Map.Entry,które przechowują pary klucz-wartosc.
        //Metoda entrySet() zwraca cały zestaw tyych par z mapy

        Set<Map.Entry<String,String>> pary = kodony.entrySet();

        //iterujemy po obiekcie typu Set
        System.out.println("\nIteracja: ");
        for(Map.Entry<String,String>para : pary){
            System.out.println("klucz: " + para.getKey() + " wartość: " + para.getValue());
        }



    }
}
