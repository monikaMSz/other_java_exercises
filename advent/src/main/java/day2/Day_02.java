package day2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day_02 {
    /**
     * For each row, determine the difference between the largest value and the smallest value;
     * the checksum is the sum of all of these differences.
     */

    private static List<String> input;

    public static void main(String[] args) {
        try {
            input = Files.readAllLines(Paths.get("input2.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(part1());
        System.out.println(part2());
    }

    static int part1() {
        int sum = 0;
        for (String line : input) {
            String[] numbers = line.split("\t");


            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;


            for (int i = 0; i < numbers.length; i++) {
                int number = Integer.parseInt(numbers[i]);
                if (number > max)
                    max = number;
                else if (number < min)
                    min = number;
            }
            int diff = max - min;
            sum += diff;
        }
        return sum;

    }

    static int part2() {
        int sum = 0;
        for (String line : input) {
            String[] numbers = line.split("\t");
            int division = 0;
            for (int i = 0; i < numbers.length; i++) {
                int num1 = Integer.parseInt(numbers[i]);
                for (int j = 0; j < numbers.length; j++) {
                    int num2 = Integer.parseInt(numbers[j]);
                    if (num1 != num2) {
                        if (num1 % num2 == 0)
                            division = num1 / num2;

                    }
                }
            }
            sum += division;
        }
        return sum;

    }

}