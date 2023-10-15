package edu.hw1;

public class Task3 {
    public static boolean canBeNested(int[] a1, int[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return false;
        }

        int minA1 = findMin(a1);
        int maxA1 = findMax(a1);
        int minA2 = findMin(a2);
        int maxA2 = findMax(a2);

        return minA1 > minA2 && maxA1 < maxA2;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a1 = {2, 3, 4};
        int[] a2 = {1, 2, 3, 4, 5};

        boolean result = canBeNested(a1, a2);
        System.out.println(result);
    }
}
