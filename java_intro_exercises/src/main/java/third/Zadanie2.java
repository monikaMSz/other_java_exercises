package third;

public class Zadanie2 {
    public int multiplyElements(int [][]array){
        int iloczyn=1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                iloczyn*=array[i][j];

            }
        }return iloczyn;

    }
}
