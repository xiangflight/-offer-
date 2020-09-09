package interview.hw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/8
 */

public class Solution057 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String num1 = str.trim();
            String num2 = br.readLine().trim();
            solution(num1, num2);
        }
    }

    static void solution(String num1, String num2) {
        String res = add(num1, num2);
        System.out.println(res);
    }

    static String add(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        StringBuilder builder = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = x + y + carry;
            builder.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        builder.reverse();
        return builder.toString();
    }

    /**
     * 131234132142141243
     * -21341234234234244
     *
     * @param num1 num1
     * @param num2 num2
     * @return result
     */
    static String minus(String num1, String num2) {
        String bigger = "";
        String smaller = "";
        if (num1.length() > num2.length()) {
            bigger = num1;
            smaller = num2;
        } else if (num1.length() < num2.length()) {
            bigger = num2;
            smaller = num1;
        } else {
            if (num1.equals(num2)) {
                return "0";
            }
            for (int i = 0; i < num1.length(); i++) {
                if (num1.charAt(i) > num2.charAt(i)) {
                    bigger = num1;
                    smaller = num2;
                    break;
                } else if (num1.charAt(i) < num2.charAt(i)) {
                    bigger = num2;
                    smaller = num1;
                    break;
                }
            }
        }

        int i = bigger.length() - 1, j = smaller.length() - 1, carry = 0;

        StringBuilder builder = new StringBuilder();

        while (j >= 0) {
            int x = bigger.charAt(i) - '0' - carry;
            int y = smaller.charAt(j) - '0';
            if (x >= y) {
                builder.append(x - y);
            } else {
                builder.append(x + 10 - y);
                carry = 1;
            }
            i--;
            j--;
        }
        while (i >= 0) {
            int n = bigger.charAt(i) - '0' - carry;
            builder.append(n);
            carry = 0;
            i--;
        }
        builder.reverse();
        return builder.toString();
    }

}
