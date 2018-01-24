package second;

/* Napisz funkcję, która dla wczytanego od
 * użytkownika słowa, wyświetla jego litery
 * w kolejności odwrotnej.
 */
public class Zadanie6 {
    String reverseWord (String word){
        String arr[] = word.split("");
        String temp="";
        for(int i=arr.length-1;i>=0;i--){
            temp+=arr[i];
        }return temp;

    }
}
