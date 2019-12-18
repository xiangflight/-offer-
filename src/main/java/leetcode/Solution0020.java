package leetcode;

import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/18
 */

public class Solution0020 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (isLeftParenthesis(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (!isMatch(c, stack.pop())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftParenthesis(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean isMatch(char c, char top) {
        return (top == '(' && c == ')') || (top == '[' && c == ']') || (top == '{' && c == '}');
    }

}
