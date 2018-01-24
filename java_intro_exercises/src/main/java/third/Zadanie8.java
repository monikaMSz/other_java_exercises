package third;

public class Zadanie8 {
    public int[] sumEvenInRows(int[][]array){
        int[]result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] % 2==0){
                    result[i]+= array[i][j];
                }
            }

        }return result;
    }
}
