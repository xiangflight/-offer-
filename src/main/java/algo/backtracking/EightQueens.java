package algo.backtracking;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/17
 */

public class EightQueens {

    private static final int WIDTH = 8;
    /**
     * 下标：行，值：列
     */
    int[] result = new int[8];

    public static void main(String[] args) {
        new EightQueens().cal8Queens(0);
    }

    public void cal8Queens(int row) {
        if (row == WIDTH) {
            printQueens(result);
            return;
        }
        // 每一行都有 8 种放法
        for (int column = 0; column < WIDTH; column++) {
            if (isOk(row, column)) {
                // 第 row 行的棋子放到了第 column 列
                result[row] = column;
                // 考察下一行
                cal8Queens(row + 1);
            }
        }
    }

    /**
     * 判断 row 行 column 列是否合适？
     *
     * @param row    行
     * @param column 列
     * @return true if 合适
     */
    private boolean isOk(int row, int column) {
        int leftUp = column - 1, rightUp = column + 1;
        for (int i = row - 1; i >= 0; --i) {
            if (result[i] == column) {
                return false;
            }
            if (leftUp >= 0) {
                if (result[i] == leftUp) {
                    return false;
                }
            }
            if (rightUp < 8) {
                if (result[i] == rightUp) {
                    return false;
                }
            }
            --leftUp;
            ++rightUp;
        }
        return true;
    }

    private void printQueens(int[] result) {
        for (int row = 0; row < WIDTH; row++) {
            for (int column = 0; column < WIDTH; column++) {
                if (result[row] == column) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
