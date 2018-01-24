package third;

public class Zadanie6 {
    public int minElemArray(int [][]array){
        int min=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(min>array[i][j]){
                    min=array[i][j];
                }

            }
        }return min;
    }
}
