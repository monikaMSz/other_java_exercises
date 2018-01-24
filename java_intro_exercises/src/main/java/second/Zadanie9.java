package second;

/* Napisz funkcję, sprawdzającą czy przekazany argument (String)
 * jest palindromem (należy uwzględnić pomijanie spacji).
 */
public class Zadanie9 {
    boolean palindrome(String word) {
        String temp = "";
        String[] arr = word.toLowerCase().replace(" ", "").split("");
        for (int i = arr.length - 1; i >= 0; i--) {
            temp += arr[i];
        }return word.replace(" ","").toLowerCase().equals(temp);
    }
}
