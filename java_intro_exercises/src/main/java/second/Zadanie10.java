package second;/* Napisz zadanie które wyświetla wszystkie liczby pierwsze
 * z zakresu od 1 do 100.
 */

public class Zadanie10 {

    void showPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {//this.isPrime(i)
                System.out.println(i);
            }
        }
    }


    /*to sprawdza każda kolejną liczbe czy jest pierwsza,na gorze przekazuje liczbe do sprawdzenia od 2 a w tej metodzie
    spradza iterujac po kazdym i liczby.n tutaj to będzie podana liczba do sprawdzenia podana z fora z showPrimes przy
    zastasowaniu mewtody isPrime(i). i dla 5 bedzie sprawdzalo czy false czy true np 5%2->true;5%3(nie daje reszty0) ->true;
    5%4,5%5 - daje reszte 0 ale ma bbyć mniejsze niż 5 nie mneijsze równe, więc nie spraedzamy 5%5.*/
    boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;

            }
        }
        return prime;
    }
}

