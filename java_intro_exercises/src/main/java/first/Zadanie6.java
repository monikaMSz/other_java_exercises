package first;

/* Napisz funkcję, która dla zadanej liczby zwróci
 * sumę kwadratów poszczególnych liczb od 1 do zadanej liczby.
 * Przyjmij i zbadaj czy użytkownik przekazał
 * liczbę w przedziale <0, 10>
 */
public class Zadanie6 {
    int squares(int a) {

        if (a < 0 || a > 10) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i * i;
        }
        return sum;
    }
}
