package edu.hw1;

public class Task4 {
    public static String fixString(String input) {
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String mixedString = "оПомигети псаривьтс ртко!и";
        String fixedString = fixString(mixedString);
        System.out.println(fixedString);
    }
}

