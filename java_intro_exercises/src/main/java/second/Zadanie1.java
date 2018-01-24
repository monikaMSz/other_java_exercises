package second;/* Mamy dwie tablice liczb całkowitych, należy
 * wyświetlić te liczby, które występują w obydwu tablicach  */

public class Zadanie1 {
    void sameNumbers(int[]a,int[]b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
