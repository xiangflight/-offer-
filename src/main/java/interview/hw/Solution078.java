package interview.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/9
 */

public class Solution078 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String num1 = str.trim();
            String num2 = br.readLine().trim();
            solution(num1, num2);
        }
    }

    static void solution(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        StringBuilder builder = new StringBuilder();
        while ((i >= 0) || (j >= 0) || (carry != 0)) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = x + y + carry;
            builder.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        builder.reverse();
        System.out.println(builder.toString());
    }

}
