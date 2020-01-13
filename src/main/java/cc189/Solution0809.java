package cc189;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/9
 */

public class Solution0809 {

    public static void main(String[] args) {
        int input = 3;
        ArrayList<String> strings = new Solution0809().generateParens1(input);
        System.out.println(strings);
    }

    Set<String> generateParens(int remaining) {
        Set<String> set = new HashSet<>();
        if (remaining == 0) {
            set.add("");
            return set;
        }
        Set<String> prev = generateParens(remaining - 1);
        for (String str: prev) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    String s = insertInside(str, i);
                    set.add(s);
                }
            }
            set.add("()" + str);
        }
        return set;
    }

    private String insertInside(String str, int leftIndex) {
        String left = str.substring(0, leftIndex + 1);
        String right = str.substring(leftIndex + 1, str.length());
        return left + "()" + right;
    }

    ArrayList<String> generateParens1(int count) {
        char[] str = new char[count * 2];
        ArrayList<String> list = new ArrayList<>();
        addParens(list, count, count, str, 0);
        return list;
    }

    private void addParens(ArrayList<String> list, int leftRemains, int rightRemains, char[] str, int index) {
        if (leftRemains < 0 || rightRemains < leftRemains) {
            return;
        }
        if (leftRemains == 0 && rightRemains == 0) {
            list.add(String.copyValueOf(str));
        } else {
            str[index] = '(';
            addParens(list, leftRemains - 1, rightRemains, str, index + 1);

            str[index] = ')';
            addParens(list, leftRemains, rightRemains - 1, str, index + 1);
        }
    }

}
