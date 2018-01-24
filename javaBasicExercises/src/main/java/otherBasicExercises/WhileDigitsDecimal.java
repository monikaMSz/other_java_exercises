package otherBasicExercises;

public class WhileDigitsDecimal {
    public static void main(String[] args) {
        int n = 598765654;
        int result = 0;

        while(n>0){
            n=n/10;
            result++;
        }
        System.out.println(result);
    }
}
