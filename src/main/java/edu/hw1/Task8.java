package edu.hw1;
public class Task8 {
    public static boolean canKnightsCoexist(int[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 1) {
                    if (isAttackedByOtherKnights(board, i, j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean isAttackedByOtherKnights(int[][] board, int x, int y) {
        int[][] moves = {
                {-2, -1}, {-2, 1}, {2, -1}, {2, 1},
                {-1, -2}, {-1, 2}, {1, -2}, {1, 2}
        };

        for (int[] move : moves) {
            int newX = x + move[0];
            int newY = y + move[1];
            if (isValid(newX, newY) && board[newX][newY] == 1) {
                return true;
            }
        }

        return false;
    }


    private static boolean isValid(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        boolean result = canKnightsCoexist(board);
        System.out.println(result);
    }
}
