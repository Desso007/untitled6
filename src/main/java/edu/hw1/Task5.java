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

    public static int sumAdjacentDigits(int number) {
        String numberStr = String.valueOf(number);
        int sum = 0;

        for (int i = 0; i < numberStr.length() - 1; i++) {
            int digit1 = Character.getNumericValue(numberStr.charAt(i));
            int digit2 = Character.getNumericValue(numberStr.charAt(i + 1));
            sum += digit1 + digit2;
        }

        return sum;
    }

    public static boolean hasPalindromeDescendant(int number) {
        String numberStr = String.valueOf(number);

        if (isPalindromeString(numberStr)) {
            return true;
        }

        int sum = sumAdjacentDigits(number);

        if (isPalindrome(sum)) {
            return true;
        }

        return hasPalindromeDescendant(sum);
    }

    public static void main(String[] args) {
        int number1 = 11211230;
        int number2 = 13001120;
        int number3 = 23336014;

        System.out.println(hasPalindromeDescendant(number1));
        System.out.println(hasPalindromeDescendant(number2));
        System.out.println(hasPalindromeDescendant(number3));
    }
}

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
