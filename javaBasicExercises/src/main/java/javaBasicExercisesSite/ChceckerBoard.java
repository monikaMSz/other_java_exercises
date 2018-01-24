package javaBasicExercisesSite;

public class ChceckerBoard {
    public static void main(String[]args){
        for(int row=1; row<=7;row++){
            if((row%2==0)){
                System.out.print(" ");
            }
            for(int col=1;col<=7;col++){
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
