package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/2
 */

public class Solution040 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            int alphaNum = 0;
            int blankNum = 0;
            int digitNum = 0;
            int otherNum = 0;
            for (char c: line.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    alphaNum++;
                } else if (Character.isSpaceChar(c)) {
                    blankNum++;
                } else if (Character.isDigit(c)) {
                    digitNum++;
                } else {
                    otherNum++;
                }
            }
            System.out.println(alphaNum);
            System.out.println(blankNum);
            System.out.println(digitNum);
            System.out.println(otherNum);
        }
        sc.close();
    }

}
