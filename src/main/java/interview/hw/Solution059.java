package interview.hw;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/8
 */

public class Solution059 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            char c = firstChar(line);
            if (c == ' ') {
                System.out.println(-1);
            } else {
                System.out.printf("%c\n", c);
            }
        }
        sc.close();
    }

    static char firstChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch: str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return ' ';
    }

}
