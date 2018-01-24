package javaBasicExercisesSite;

public class HarmonicSum {
    public static void main(String[] args){
        int maxN=50000;
        double sumLeft=0.0;
        double sumRight=0.0;
        for(int i=1;i<=maxN;i++){
            sumLeft=sumLeft + (double)1/i;

        }
        System.out.println("from left to right" + sumLeft);
        for(double i=1;i<=maxN;i++){
            sumRight=sumRight + 1/(maxN-i+1);
        }
        System.out.println("from right to left: " + sumRight);
    }
}
