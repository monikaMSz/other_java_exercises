package otherBasicExercises;

public class cwTablice1GGoralskiJava42 {
    public static void main(String[] args) {
        int [] tablica = new int[]{4,9,2,6,4,8,7,2,0,1};

        //zmienna tmczasowa która przechowuje tymczasowo wartość
        int tmp;


        System.out.println("przed odwróceniem: ");
        for(int i=0;i<tablica.length;i++){
            System.out.print(tablica[i] + " ");
        }
        //petla od 0 do 1/2 poniewważ zamieniamy raz element ostatni z pierwszym,
        //przedostatni z drugim itd.,aż dojdziemy do środka tablicy
        for(int i=0;i<tablica.length/2;i++){
            //kopiowanie wartrości z tablicy do zmiennej
            tmp=tablica[i];
            //kopiowanie wartości do kolejnych komórek z miejsca tablica.length-1-i bo:
            //-1 poniewaz ostatni indeks w tablicy jest o 1 mniejszy niz numer ostatniego indeksu
            //-i : przesuwamy sie o 1 od końca  do środka
            tablica[i]=tablica[tablica.length-1-i];
            tablica[tablica.length-1-i] = tmp;
        }
        System.out.println("po odwróceniu: ");
        for(int i=0;i<tablica.length;i++){
            System.out.print(tablica[i] + " ");
        }
    }
}
