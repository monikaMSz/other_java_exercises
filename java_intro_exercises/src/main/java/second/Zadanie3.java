package second;

/* Napisz funkcję, w której dla zadanego łańcucha znaków,
 * wszystkie znaki - takie same jak pierwsza litera ciągu
 * znaków zostaną zamienione na znak '_', wyjątkiem jednak
 * jest pierwszy znak. Dla przykładu:
 * Wejście: oksymoron
 * Wyjście: oksym_r_n
 */
public class Zadanie3 {
    String changeLetters(String s){
        String firstLetter = s.substring(0,1);
     return firstLetter + s.replace(firstLetter, "_").substring(1);
    }
}
