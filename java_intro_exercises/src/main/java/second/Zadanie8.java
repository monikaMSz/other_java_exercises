package second;/* Dane jest osiedle bloków. Każdy blok zawiera 2 klatki,
 * po 2 piętra (+ parter), na każdym piętrze znajdują się
 * dwa mieszkania. Napisz skrypt, który wyświetli adres
 * każdego mieszkania tak, aby można było zaadresować kopertę.
 * Bloki znajdują się tylko pod numerami nieparzystymi -
 * pierwszy blok znajduje się pod numerem 1.
 * Funkcja powinna przyjmować nazwę ulicy oraz ostatni numer,
 * który występuje na danej ulicy (może być parzysty lub nieparzysty)
 * oraz na wyjściu drukować poszczególne adresy.
 */

public class Zadanie8 {
    void showAddres(String ulica,int numer){
        String staircase="A";
        for(int i=1;i<=numer;i+=2){
            for(int j=1;j<=12;j++){
                staircase=(j<=6)? "A" : "B";
                System.out.println("ul." + ulica + " " + i +"/"+staircase +"/"+ j);
            }
        }
    }
}
