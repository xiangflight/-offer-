package utils;

import dsa.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */

public class Assert {

    public static void checkNotEmpty(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("arr should not be null or empty");
        }
    }

    public static void checkNotNull(String str) {
        if (str == null) {
            throw new IllegalArgumentException("string should not be null");
        }
    }

    public static void checkNotNull(ListNode node) {
        if (node == null) {
            throw new IllegalArgumentException("node should not be null");
        }
    }
}
