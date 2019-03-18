package coding_interviews;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-18 21:42
 *
 * 数组中只出现一次的数字
 *
 */

public class Solution44 {

    /**
     * 题目：一个整型数组里除了两个数字之外，其他的数字都
     *      出现了两次。找出这两个只出现一次的数字，要求
     *      时间复杂度是O(N)
     *
     * @param array 输入的数组
     * @param num1 第一个只出现一次的数字 num1[0]
     * @param num2 第二个只出现一次的数字 num2[0]
     */
    public void findNumsAppearOnce(int[] array,int[] num1 , int[] num2) {
        if (array == null || array.length < 2) {
            num1[0] = 0;
            num2[0] = 0;
            return;
        }
        int allXor = 0;
        for (int val: array) {
            allXor ^= val;
        }
        allXor &= -allXor;
        for (int val: array) {
            if ((val & allXor) == 0) {
                num1[0] ^= val;
            } else {
                num2[0] ^= val;
            }
        }
    }

}
