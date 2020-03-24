package leetcode.cc189;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/24
 *
 *  * 输入： [1,2,3,1]
 *  * 输出： 4
 *  * 解释： 选择 1 号预约和 3 号预约，总时长 = 1 + 3 = 4。
 *  *
 *  * 输入： [2,7,9,3,1]
 *  * 输出： 12
 *  * 解释： 选择 1 号预约、 3 号预约和 5 号预约，总时长 = 2 + 9 + 1 = 12。
 *  *
 *  * 输入： [2,1,4,5,3,1,1,3]
 *  * 输出： 12
 *  * 解释： 选择 1 号预约、 3 号预约、 5 号预约和 8 号预约，总时长 = 2 + 4 + 3 + 3 = 12。
 */

class Test1716 {

    private final Solution1716 solution = new Solution1716();

    @Test
    @DisplayName("The Masseuse Lcci")
    void massage() {
        int[] nums = {1, 2, 3, 1};
        int expected = 4;
        assertEquals(expected, solution.massage(nums));
        nums = new int[] {2, 7, 9, 3, 1};
        expected = 12;
        assertEquals(expected, solution.massage(nums));
        nums = new int[] {2, 1, 4, 5, 3, 1, 1, 3};
        expected = 12;
        assertEquals(expected, solution.massage(nums));
    }
}