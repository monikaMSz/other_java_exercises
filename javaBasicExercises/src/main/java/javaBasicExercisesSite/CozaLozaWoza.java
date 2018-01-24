package javaBasicExercisesSite;

public class CozaLozaWoza {

    public static void main(String[] args) {
        //int liczba = 1;
       // boolean printed;
        for (int i = 1; i <= 110; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("\t"+"CozaLoza");
               // printed=true;
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("\t"+"CozaWoza");
               // printed=true;
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print(" \t"+"LozaWoza");
              //  printed=true;
            } else if (i % 3 == 0) {
                System.out.print("\t"+"Coza");
               // printed=true;
            } else if (i % 5 == 0) {
                System.out.print(" \t"+"Loza");
                //printed=true;
            } else if (i % 7 == 0) {
                System.out.print("\t"+"Woza");
               // printed=true;
            } else if (i % 3 != 0 || i % 5 != 0 || i % 7 != 0)
            {
                System.out.print("\t"+i);
            }
            if (i % 11 == 0) {
                System.out.println();

            }
        }
    }
}

