package second;

/* Mamy dwie tablice liczb całkowitych, należy
 * wyświetlić liczby z obu tablic, które się nie powtarzają   */
public class Zadanie2 {
    void showDifferentNumbers(int[] a, int[] b) {
        Zadanie0 arrUtils = new Zadanie0();
        for (int i = 0; i < a.length; i++) {
            if (arrUtils.returnArg(b, a[i]) == -1) {
                System.out.println(a[i]);
            }
//            if (arrUtils.returnArg(a,b[i])== -1){
//                System.out.println(b[i]);
//
//
//            }
        }
    }
    void printBoth(int[]a, int []b){
        this.showDifferentNumbers(a,b);
        this.showDifferentNumbers(b,a);
    }
}
