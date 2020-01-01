package swordoffer;

import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 */

public class Solution031 {

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || popA == null) {
            return false;
        }
        if (pushA.length != popA.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int len = pushA.length;
        for (int i = 0, j = 0; i < len; i++) {
            stack.push(pushA[i]);
            while (j < len && !stack.isEmpty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

}
