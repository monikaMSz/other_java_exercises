package first;

/* Napisz funkcję zwracającą
 * wartość bezwzględną z liczby
 * przekazanej jako parametr
 */
public class Zadanie1 {
    public int abs(int x) {
        if (x < 0) {
            x = -x;
        }
        return x;
    }
}

