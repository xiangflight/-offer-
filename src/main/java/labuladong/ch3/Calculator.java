package labuladong.ch3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/10
 */

public class Calculator {

    public static void main(String[] args) {
        int res = new Calculator().calculate("1 + (2- 9) * 4");
        System.out.println(res);
    }

    int calculate(String s) {
        Deque<Character> expression = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            expression.add(c);
        }
        return helper(expression);
    }

    private int helper(Deque<Character> expression) {
        Stack<Integer> stack = new Stack<>();
        char sign = '+';
        int num = 0;

        while (expression.size() > 0) {
            char c = expression.pollFirst();
            if (Character.isDigit(c)) {
                num = 10 * num + (c - '0');
            }
            if (c == '(') {
                num = helper(expression);
            }
            if ((!Character.isDigit(c) && c != ' ') || expression.size() == 0) {
                int pre;
                switch (sign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        pre = stack.pop();
                        stack.push(pre * num);
                        break;
                    case '/':
                        pre = stack.pop();
                        stack.push(pre / num);
                        break;
                    default:
                }
                num = 0;
                sign = c;
            }
            if (c == ')') {
                break;
            }
        }

        return sum(stack);
    }

    private int sum(Stack<Integer> stack) {
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }


}
