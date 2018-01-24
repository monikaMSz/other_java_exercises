package second;

/* Napisz funkcję, która przyjmie dwa argumenty:
 * liczbę znaków oraz zdanie. Funkcja powinna
 * wypisać słowa, które są dłuższe niż zadana
 * liczba w pierwszym argumencie.
 */
public class Zadanie4 {
    void lengthOfWords (String sentence,int length){
        String[] tempArr = sentence.split(" ");
        for(String elem : tempArr){
            if(elem.length()>length){
                System.out.println(elem);
            }
        }
    }
}
