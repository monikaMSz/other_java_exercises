package javaBasicExercisesSite;

public class SumAndAverage {

    public static void main(String[] args) {

        int liczba=0;
        int suma = 0;
        double average=0;
        int count=0;
        for (
                int i = 1;
                i <= 100; i++)


        {
            suma = suma + i*i;
            ++count;


        }System.out.println("the sum is: " + suma);
        System.out.println(count);
        for(double i =1;i<=100;i++){
            average=suma;
        }
        System.out.println("the average is: " + average/100);

        while(liczba<=100){
            suma+=liczba;
            ++liczba;
        }
        System.out.println(suma);

        do{
            suma+=liczba;
            ++liczba;
        }while (liczba<=100);
        System.out.println(suma);
    }

    }

