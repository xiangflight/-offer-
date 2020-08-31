package interview.hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/31
 */

public class Solution066 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<String, String>(6) {
            {
                put("reset", "reset what");
                put("reset board", "board default");
                put("board add", "where to add");
                put("board delete", "no board at all");
                put("reboot backplane", "impossible");
                put("backplane abort", "install first");
            }
        };

    }

}
