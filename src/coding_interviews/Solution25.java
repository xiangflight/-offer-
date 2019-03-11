package coding_interviews;

import java.util.Stack;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-11 09:21
 *
 * 栈的压入、弹出序列
 *
 */

public class Solution25 {

    /**
     * 题目：输入两个整数序列，第一个序列表示栈的压入顺序，请判断第
     *      二个序列是否为该栈的弹出顺序。例如：
     *      序列1、2、3、4、5是某栈的压栈序列
     *      序列4、5、3、2、1是该压栈序列的一个弹出序列
     *      序列4、3、5、1、2不是该压栈序列的一个弹出序列
     *
     * @param pushA 压栈序列
     * @param popA 弹栈序列
     * @return 弹栈序列是否对应压栈序列
     */
    public boolean isPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || popA == null
                || pushA.length != popA.length) {
            return false;
        }
        // 建立一个辅助栈，模拟压入弹出操作。
        Stack<Integer> helper = new Stack<>();
        // 记录pushIndex和popIndex
        for (int pushIndex = 0, popIndex = 0; pushIndex < pushA.length; pushIndex++) {
            helper.push(pushA[pushIndex]);
            while (popIndex < popA.length && !helper.isEmpty()
                    && helper.peek() == popA[popIndex]) {
                helper.pop();
                popIndex++;
            }
        }
        return helper.isEmpty();
    }

}
