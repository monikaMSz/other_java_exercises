package second;

/* Napisz funkcję przyjmującą dwa argumenty, tablicę liczb całkowitych
 * oraz liczbę całkowitą. Funkcja powinna zwracać indeks,
 * pod którym znajduje się pierwsze wystąpienie danego elementu,
 * lub -1 jeśeli taki element nie występuje w tablicy. */
public class Zadanie0 {
    int returnArg (int []array,int arg){
        for(int i=0;i<array.length;i++){
            if(array[i]==arg){
                return i;
            }
        }return -1;
    }
}
