package edu.hw1;

public class Task7 {
    public static int rotateLeft(int n, int shift) {
        int bits = 32;
        return (n << shift) | (n >>> (bits - shift));
    }

    public static int rotateRight(int n, int shift) {
        int bits = 32;
        return (n >>> shift) | (n << (bits - shift));
    }

    public static void main(String[] args) {
        int n = 0b1100;
        int shift = 2;

        int resultLeft = rotateLeft(n, shift);
        int resultRight = rotateRight(n, shift);

        System.out.println(Integer.toBinaryString(resultLeft));
        System.out.println(Integer.toBinaryString(resultRight));
    }
}
