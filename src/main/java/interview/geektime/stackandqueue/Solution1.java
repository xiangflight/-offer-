package interview.geektime.stackandqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/19
 */

public class Solution1 {

    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> parenMap = new HashMap<Character, Character>(3) {
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };
        for (char c: arr) {
            if (!parenMap.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !parenMap.get(c).equals(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
