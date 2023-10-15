package edu.hw1;

public class Task5 {
    public static boolean isPalindrome(int number) {
        String numberStr = String.valueOf(number);
        return isPalindromeString(numberStr);
    }

    public static boolean isPalindromeString(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean hasPalindromeDescendant(int number) {
        String numberStr = String.valueOf(number);


        if (isPalindromeString(numberStr)) {
            return true;
        }


        for (int i = 1; i < numberStr.length(); i++) {
            int leftPart = Integer.parseInt(numberStr.substring(0, i));
            int rightPart = Integer.parseInt(numberStr.substring(i));

            if (leftPart > 0 && rightPart > 0 && isPalindrome(leftPart) && isPalindrome(rightPart)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int number1 = 123312;
        int number2 = 121;
        int number3 = 12345;

        System.out.println(hasPalindromeDescendant(number1));
        System.out.println(hasPalindromeDescendant(number2));
        System.out.println(hasPalindromeDescendant(number3));
    }
}
