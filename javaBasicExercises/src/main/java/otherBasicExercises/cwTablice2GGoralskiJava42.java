package otherBasicExercises;

public class cwTablice2GGoralskiJava42 {
    public static void main(String[] args) {

        //s2=(xi-xs)2/N-1
        //s2 - wariancja
        ///xi - kolejny pomiar, czyli liczba w tablicy
        //xs - srednia z pomiarow
        //N - liczba pomiarow
        double []tablica = new double[]{1.0,2.0,2.5,4.0,3.7,3.5,2.3,2.5,3.6};
        double suma = 0.0;
        double srednia = 0.0;
        double sumaRoznic = 0.0;
        int N = tablica.length;
        double wariancja;

        //obliczanie sumy elementów w tablicy
        for(int i=0;i<tablica.length;i++){
            suma+=tablica[i];
        }
        //obliczanie średniej
        srednia = suma/N;

        //obliczanie sumy kwadratów roznic wartości i średniej
        for(int i=0; i<tablica.length;i++){
            sumaRoznic+=(tablica[i]-srednia)*(tablica[i]-srednia);
        }
        //onliczanie wariancji
        wariancja = sumaRoznic/(N-1);
        System.out.println("Wariancja: " + wariancja);
    }
}
