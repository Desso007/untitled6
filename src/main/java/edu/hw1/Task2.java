package edu.hw1;


public class Task2 {
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;


        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(123));
        System.out.println(countDigits(0));
        System.out.println(countDigits(-987688888));
    }
}