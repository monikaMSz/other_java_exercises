package first;

/* Dla zadanej tablicy elementów liczb całkowitych,
 * napisz program, który pokaże rónicę największego
 * oraz najmniejszego elementu, przykładowo, tablica
 * zawiera elementy -5, 3, 2, 1, 10, wynik powinien
 * wynosić 15, gdyż -5 to najmniejszy element, a 10
 * to największy.
 */
public class Zadanie8 {
    int countTheDifference(int[]array){
        int max=0;
        int min=0;
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
            if(max<array[i]){
                max=array[i];
            }
        }return max-min;
    }
}
