package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/9
 */

public class Solution044 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[9][9];
        while (sc.hasNext()) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    board[i][j] = sc.nextInt();
                }
            }
            solution(board);
        }
        sc.close();
    }

    static void solution(int[][] board) {
        backtrack(board, 0, 0);
        printBoard(board);
    }

    private static boolean backtrack(int[][] board, int i, int j) {
        if (j == 9) {
            return backtrack(board, i + 1, 0);
        }
        if (i == 9) {
            return true;
        }
        if (board[i][j] != 0) {
            return backtrack(board, i, j + 1);
        }
        for (int m = 1; m <= 9; m++) {
            if (!isValid(board, i, j, m)) {
                continue;
            }
            board[i][j] = m;
            if (backtrack(board, i, j + 1)) {
                return true;
            }
            board[i][j] = 0;
        }
        return false;
    }

    private static boolean isValid(int[][] board, int row, int col, int m) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == m) {
                return false;
            }
            if (board[i][col] == m) {
                return false;
            }
            if (board[(row / 3) * 3 + i / 3][(col / 3) * 3 + i % 3] == m) {
                return false;
            }
        }
        return true;
    }

    static void printBoard(int[][] board) {
        for (int[] row: board) {
            for (int element: row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
