package third;

public class Zadanie5 {
    public int multiplyElemDividedByThree(int[][]array){
        int multiplication=1;
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%3==0){
                    multiplication*=array[i][j];
                }

            }

        }return multiplication;
    }
}
