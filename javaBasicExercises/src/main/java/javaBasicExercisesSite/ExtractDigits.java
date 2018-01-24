package javaBasicExercisesSite;

public class ExtractDigits {
    public static void main(String[] args) {
        int n = 15423;
        while (n > 0){
            int digits=n%10;
            n=n/10;
            System.out.print("\t" +digits);
        }

    }
}
