package third;

public class Zadanie3 {
    public int multiplyEvenElements(int[][] array) {
        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    multiplication*=array[i][j];
                }

            }
        }return multiplication;
    }
}
