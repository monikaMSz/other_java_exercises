import java.lang.reflect.Array;
import java.util.*;

public class Zadanie8 {
    public static void main(String[] args) {

         int[]array = new int[100];
        Random random = new Random();
        for(int i=0;i<array.length;i++){

            array[i]=random.nextInt(20);
          //  Arrays.sort(array);
           System.out.print(array[i]+ " ");

        }




        System.out.println();
        countNumbers(array);

    }



    static void countNumbers(int[]tab){
        Map<Integer,Integer> count = new HashMap<>();
        for (int i:tab
             ) {
            if(count.containsKey(i)){
                count.put(i,count.get(i)+1);
            }else{
                count.put(i,1);
            }

        }
        System.out.println("Element count : "+count);
    }
}
