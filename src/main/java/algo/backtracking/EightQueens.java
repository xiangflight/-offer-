package algo.backtracking;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/17
 */

public class EightQueens {

    private static final int WIDTH = 8;

    private void printQueens(int[] result) {
        for (int row = 0; row < WIDTH; row++) {
            for (int column = 0; column < WIDTH; column++) {
                if (result[row] == column) {
                    System.out.print("Q ");
                }
            }
        }
    }

}
