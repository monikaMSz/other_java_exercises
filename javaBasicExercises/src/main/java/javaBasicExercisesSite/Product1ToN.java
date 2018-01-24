package javaBasicExercisesSite;

public class Product1ToN {
    public static void main(String[] args) {
        long product = 1;
        int liczba = 0;

        for (int i=1;i<=13;i++){
            product*=i;
        }
        System.out.println(product);

    }
}
