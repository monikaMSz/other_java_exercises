package day1;

public class Day_01 {
    /**
     * find the sum of all digits that match the next digit in the list. The list is circular, so the digit after the
     * last digit is the first digit in the list
     */

    public int inverseCaptcha_part1(String input) {
        char[] arr = input.toCharArray();
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                sum += Integer.valueOf(String.valueOf(arr[i]));

            }

        }
        if (arr[arr.length - 1] == arr[0]) {
            sum2 = +Integer.valueOf(String.valueOf(arr[0]));
        }

        return sum + sum2;

    }

    public int inverseCaptcha_part1_ver2(String input) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                sum += Character.getNumericValue(input.charAt(i));

            }

        }
        if (input.charAt(input.length() - 1) == input.charAt(0)) {
            sum2 = +Character.getNumericValue(input.charAt(0));
        }

        return sum + sum2;

    }

    public int inverseCaptcha_part1_ver3(String input) {
        int sum = 0;
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[(i + 1) % arr.length]) {
                sum += Integer.parseInt(String.valueOf(arr[i]));
            }
        }return sum;
    }


    public int inverseCaptcha_part2(String input){
        int sum=0;
        char[]arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== arr[(i + arr.length/2)% arr.length]){
                sum+=Integer.parseInt(String.valueOf(arr[i]));
            }
        }return sum;
    }

}