package edu.hw1;

import java.util.Arrays;

public class Task6 {
    public static int kaprekarSteps(int number) {
        if (number == 6174) {
            return 0;
        }


        String numberStr = String.format("%04d", number);


        char[] digits = numberStr.toCharArray();


        Arrays.sort(digits);
        String ascendingStr = new String(digits);
        String descendingStr = new StringBuilder(ascendingStr).reverse().toString();


        int ascendingNumber = Integer.parseInt(ascendingStr);
        int descendingNumber = Integer.parseInt(descendingStr);


        int difference = descendingNumber - ascendingNumber;


        return 1 + kaprekarSteps(difference);
    }

    public static void main(String[] args) {
        int number = 3524;
        System.out.println(kaprekarSteps(number));
    }
}
