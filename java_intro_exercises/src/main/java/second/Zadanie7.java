package second;

/* Napisz funkcję, która jako argument przyjmuje
 * dodatnią liczbę całkowitą większą od zera.
 * Dla podanego zakresu wydrukuj kolejne wartości pomijając te,
 * które są podzielne przez 3 lub przez 4
 */
public class Zadanie7 {

    void printNumbersTwo (int n){
        for(int i=0;i<=n;i++){
            if(i%3!=0 && i%4!=0){
                System.out.println(i);
            }
        }
    }
}
