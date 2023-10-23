package edu.hw1;

public class Task7 {
      public static final int BITS_IN_INTEGER = 32;

        public static int rotateLeft(int n, int shift) {
            return (n << (shift % BITS_IN_INTEGER)) | (n >>> (BITS_IN_INTEGER - (shift % BITS_IN_INTEGER)));
        }

        public static int rotateRight(int n, int shift) {
            return (n >>> (shift % BITS_IN_INTEGER)) | (n << (BITS_IN_INTEGER - (shift % BITS_IN_INTEGER)));
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
