package second;

/* Napisz funkcję, która zamienia dla zadanego
 * ciągu znaków pierwszy znak z ostatnim */
public class Zadanie5 {
    String changeChars(String s){
        return s.substring(s.length()-1) + s.substring(1,s.length()-1) + s.substring(0,1);
    }
}
