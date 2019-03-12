package coding_interviews;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-12 13:07
 *
 * 数组中出现次数超过一半的数字
 *
 */

public class Solution32 {

    /**
     * 题目：数组中有一个数字出现的次数超过数组长度的一半，请找出
     *      这个数字。例如输入{1,2,3,2,2,2,5,4,2}，输出2.
     *
     *      解题思路：
     *      多数投票问题，可以利用 Boyer-Moore Majority Vote Algorithm 来解决
     *      使得时间复杂度为O(N)。
     *
     *
     * @param array 输入的数组
     * @return 出现次数超过一半的数字
     */
    public int moreThanHalfNumSolution(int [] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException("array should not be empty");
        }
        int majority = array[0];
        int cnt = 1;
        for (int i = 1; i < array.length; i++) {
            cnt = (array[i] == majority) ? cnt + 1: cnt - 1;
            if (cnt == 0) {
                majority = array[i];
                cnt = 1;
            }
        }
        cnt = 0;
        for (int e: array) {
            if (e == majority) {
                cnt++;
            }
        }
        // 存在这么一个超过数组长度一半的数字
        return cnt > array.length / 2 ? majority: 0;
    }

}
