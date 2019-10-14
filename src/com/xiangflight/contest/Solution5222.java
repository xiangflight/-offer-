package com.xiangflight.contest;

import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 10:30 上午
 */

public class Solution5222 {

    public int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        stack.push(chars[0]);
        int res = 0;
        for (int i = 1; i < chars.length; i++) {
            if (!stack.isEmpty() && opposite(chars[i], stack.peek())) {
                stack.pop();
            } else {
                stack.push(chars[i]);
            }
            if (stack.isEmpty()) {
                res++;
            }
        }
        return res;
    }

    private boolean opposite(char a, char b) {
        return (a == 'L' && b == 'R') || (a == 'R' && b == 'L');
    }

    public int balancedStringSplit1(String s) {
        int ret = 0;
        int cur = 0;
        for (char c: s.toCharArray()) {
            if (c == 'L') {
                cur++;
            } else {
                cur--;
            }
            if (cur == 0) {
                ret++;
            }
        }
        return ret;
    }

}
