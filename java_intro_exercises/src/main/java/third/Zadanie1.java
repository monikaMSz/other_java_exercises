package third;

public class Zadanie1 {
    public int addElementsDividedBySev(int[][] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 7 == 0) {
                    suma += array[i][j];
                }
            }

        }
        return suma;
    }
}
