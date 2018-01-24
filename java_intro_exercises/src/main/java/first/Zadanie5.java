package first;

/* Użytkownik podaje dwie liczby całkowite a, b.
 * algorytm ma za zadanie wypisać wszystkie
 * parzyste liczby w kolejności rosnącej, a następnie
 * wszystkie liczby nieparzyste w kolejności
 * malejącej z przedziału <a;b>.
 * niech a, b �liczby całkowite z zakresu 0-255.
 * Np. dla danych wejściowych a=3, b=8,
 * otrzymujemy: 4, 6, 8, 7, 5, 3.
 */
public class Zadanie5 {
    void showOddsAndEvens(int a, int b) {
        if (a < 0 || b < 0 || a > 255 || b > 255 || b < a) {
            return;
        }
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = b; i >= a; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
