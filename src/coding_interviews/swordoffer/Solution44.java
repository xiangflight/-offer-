package coding_interviews.swordoffer;

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
        // 为什么allXor初始化0，因为0与任何数异或都等于数本身
        int allXor = 0;
        for (int val: array) {
            allXor ^= val;
        }
        // 此时，allXor就是两个出现一次数字的异或结果
        // ..
        // 有两种方式可以求得allXor最右边的1
        // 1. 通过遍历数的二进制方式，每一位与1与
        // 2. 与负的allXor做与操作，可以迅速得到allXor最右的一位
        //    举例：
        //     12 二进制表示    1100
        //    -12 二进制表示    0100 (正数二进制每一位取反加一)
        //            与结果   0100
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
