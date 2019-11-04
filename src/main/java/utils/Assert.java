package utils;

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
}
