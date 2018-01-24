package first;

/* Kasia ulokowała w banku pewna ilość złotych na okres jednego roku.
 * Oprocentowanie roczne w tym banku wynosi 19,4%.
 * Napisz algorytm, który będzie obliczał ilość pieniędzy
 * na koncie  po jednym roku dla dowolnej sumy pieniędzy.
 * Zmodyfikuj program tak, aby obliczał kwotę dla wczytanej
 * liczby lat.
 */
public class Zadanie7 {
    double oprocentowanie (double cash,int years){
        double proc=1.194;
        for(int i=1;i<years;i++){
            cash*=proc;
        }return cash;
    }
}
