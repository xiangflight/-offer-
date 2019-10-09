package com.xiangflight.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/8 12:56 下午
 *
 */

public class Solution394 {

    public String decodeStringElegantly(String s) {
        return "";
    }

    /**
     * ugly code to implement decode string
     * @param s original string
     * @return decoded string
     */
    public String decodeString(String s) {
        Deque<Character> stack = new LinkedList<>();
        char[] arr = s.toCharArray();
        for (char c: arr) {
            if (c != ']') {
                stack.push(c);
            } else {
                StringBuilder temp = new StringBuilder();
                while (stack.peek() != '[') {
                    temp.append(stack.pop());
                }
                String tempStr = temp.reverse().toString();
                stack.pop();
                int repeat = 0;
                int digit = 0;
                while (!stack.isEmpty() && isDigit(stack.peek())) {
                    repeat = (int) ((stack.pop() - '0') * Math.pow(10, digit++) + repeat);
                }
                while (--repeat > 0) {
                    temp.append(tempStr);
                }
                for (char val: temp.toString().toCharArray()) {
                    stack.push(val);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {
        String a = "100[leetcode]";
        String ans = new Solution394().decodeString(a);
        System.out.println(ans);
    }

}
