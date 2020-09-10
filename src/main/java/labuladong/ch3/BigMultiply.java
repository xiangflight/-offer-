package labuladong.ch3;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/10
 */

public class BigMultiply {

    String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int m = num1.length(), n = num2.length();
        int[] temp = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int x = num1.charAt(i) - '0';
                int y = num2.charAt(j) - '0';
                int multi = x * y;
                int p1 = i + j, p2 = i + j + 1;
                int sum = multi + temp[p2];
                temp[p1] += sum / 10;
                temp[p2] = sum % 10;
            }
        }

        for (int i : temp) {
            if (sb.length() != 0 || i != 0) {
                sb.append(i);
            }
        }

        return sb.length() == 0 ? "0": sb.toString();
    }

    String add(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
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

    public static void main(String[] args) {
        String num1 = "12";
        String num2 = "12";
        String res = new BigMultiply().multiply(num1, num2);
        System.out.println(res);
        String ans = new BigMultiply().add(num1, num2);
        System.out.println(ans);
    }

}
