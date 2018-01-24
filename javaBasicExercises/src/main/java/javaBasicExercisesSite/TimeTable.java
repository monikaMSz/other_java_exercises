package javaBasicExercisesSite;

public class TimeTable {
    static {
        System.out.println(" ");
        for (int i = 0; i <= 9; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        for (int row = 1; row <= 9; row++) {
            System.out.print(" " + row + " ");
            for (int col = 1; col <= 9; col++) {
                int product = row * col;
                if(product<10)
                    System.out.print(" " + product+ " ");
                else System.out.print( product+" ");

            }System.out.println();

        }



    }
}
