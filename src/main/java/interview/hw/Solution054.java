package interview.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/2
 */

public class Solution054 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = reader.readLine()) != null) {
            // List 存放后缀表达式
            List<String> list = new ArrayList<>();
            // 定义操作符栈stack，用于存放操作符 + - * / (
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                // 定义一个字符，记录字符串当年循环的变量
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    // 取出以当前字符开头数字结尾的整数字符串进行判定是否为数字
                    int start = i;
                    if (i == s.length() - 1) {
                        i++;
                    } else {
                        // 一直找到不是数字字符为止
                        while (Character.isDigit(s.charAt(++i))) {
                        }
                    }
                    // 将整数存入list中
                    list.add(s.substring(start, i));
                    i--;
                } else if (c == '(' || c == '[' || c == '{') {
                    // 字符为左括号则入栈
                    stack.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    //  一直出栈直到遇到左括号
                    while (stack.peek() != '(' && stack.peek() != '[' && stack.peek() != '{') {
                        // 当栈顶不为左括号时，将此操作符添加到LIST中
                        list.add(String.valueOf(stack.pop()));
                    }
                    stack.pop();
                } else if (c == '-') {
                    if ((i != 0 && (Character.isDigit(s.charAt(i - 1)) && Character.isDigit(s.charAt(i + 1)))) || (s.charAt(i - 1) == ')' || s.charAt(i - 1) == ']' || s.charAt(i - 1) == '}') || (s.charAt(i + 1) == '(' || s.charAt(i + 1) == '[') || s.charAt(i + 1) == '{') {
                        // 减号
                        while (lessThan(c, stack)) {
                            list.add(String.valueOf(stack.pop()));
                        }
                        stack.push(c);
                    } else {
                        // 负号
                        int start = i;
                        while (Character.isDigit(s.charAt(++i))) {
                        }
                        list.add(s.substring(start, i));
                        i--;
                    }
                } else if (c == '+') {
                    while (lessThan(c, stack)) {
                        list.add(String.valueOf(stack.pop()));
                    }
                    stack.push(c);
                } else if (c == '*' || c == '/') {
                    while (lessThan(c, stack)) {
                        list.add(String.valueOf(stack.pop()));
                    }
                    stack.push(c);
                }
            }
            while (!stack.isEmpty()) {
                list.add(String.valueOf(stack.pop()));
            }

            System.out.println(list);

            // 计算后缀表达式
            int res = calculate(list);
            System.out.println(res);
        }
    }

    public static boolean lessThan(char c, Stack<Character> stack) {
        if (stack.isEmpty()) {
            return false;
        } else {
            char c1 = stack.peek();
            if (c == '*' || c == '/') {
                return c1 == '*' || c1 == '/';
            } else {
                return c1 != '(' && c1 != '{' && c1 != '[';
            }
        }
    }

    public static int calculate(List<String> list) {
        // 定义数字栈，存放后缀表达式计算过程中的值
        Stack<Integer> stack = new Stack<>();
        for (String s : list) {
            int n1;
            int n2;
            switch (s) {
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n2 / n1);
                    break;
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    n1 = stack.pop();
                    n2 = stack.pop();
                    stack.push(n2 - n1);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

}
