package collectionsJavaExercises;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListaGGoralski {
    public static void main(String[] args) {
        Random random = new Random();
        //tworzenie obiektu typu AL
        ArrayList<Integer> dane = new ArrayList<Integer>();

        //Dodajemy 9losowych liczb z zakresu 0-9
        for (int i = 0; i < 9; i++) {
            dane.add(random.nextInt(10));
        }
        //dodajemy jeszcze jedna liczbe na koncu
        dane.add(5);

        //drukujemy rozmiar listy i ostatni indeks
        System.out.println("Lista posiada " + dane.size() + "elementów");

        //drukujenmy zawartość listy
        System.out.println("Zawartość listy początkow :" + dane);

        //dodajemy liczbe 8 w konkretnym miejscu indeksie 2
        dane.add(2,8); //reszta elementów przesuwa sie
        System.out.println("Po dodaniu: " + dane);

        //wstawiamy liczbe 9 w konkretnym miejscu, indeksie 2,wstawiamy a nie dodajemy,wstawiona liczba podmieni ta któtra już tam jest
        dane.set(2,9);
       System.out.println("Po wstawieniu: "+ dane);

        //usuwanie elementu z konkretnego miesjca (indeks 0)
        dane.remove(0);
        System.out.println("Po ususnieciu "+ dane);

        //szukanie liczby 9
        int indeks=dane.indexOf(9);
        System.out.println("Pierwsza liczba 9 jest pod indeksem: "+indeks);

        //usuwanie pierwszej napotkanej liczby 9
        //musimy uzyc obiektu Integer,sama liczba bylanby intem interpretowanym jako indeks
        Integer l = 9;
        dane.remove(l);
        System.out.println("Po usisnieciu 09 : " + dane);

        //pobranie elementu z określonego indeksu
       System.out.println("Piąty element to: "+ dane.get(4));

        //tworzymy dodatkowa liste
        ArrayList<Integer> dodatkowa = new ArrayList<Integer>();
        dodatkowa.add(7);
        dodatkowa.add(6);
       System.out.println("dodatkowe: " + dodatkowa.toString());

        //dodajemy zawartosc listy dodatkowa na koncu listy dane
        dane.addAll(dodatkowa);
       System.out.println("dane " + dane);

        //Przekazanie zawartości do tablicy elementów typu Integer
        Integer[] tablica = new Integer[dane.size()];
        tablica = dane.toArray(tablica);
       System.out.println("tablica: "+ tablica.getClass() + ", 1 element " + tablica[0]);

       //Usuwanie wszystkich elementów z listy
        dane.clear();
        System.out.println("Po czyszczeniu "+ dane);

    }
}
