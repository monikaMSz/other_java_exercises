public class Zadanie7 {
    public static void main(String[] args) {
        int limit = 67;
        int suma = 0;
        int input = 0;
        int count = 0;

      do {
            input++;

            suma += input;
            count++;

        } while (suma <=limit);


        System.out.println("Numbers entered: " + count);
        System.out.println("Sum of numbers: " + suma);
    }


}