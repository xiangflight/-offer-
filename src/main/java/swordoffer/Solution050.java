package swordoffer;

import java.util.Arrays;
import java.util.BitSet;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/2
 * <p>
 * 第一个只出现一次的字符
 * <p>
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * <p>
 * Input: abacc
 * Output: b
 */

public class Solution050 {

    public static void main(String[] args) {
        String s = "abacc";
        System.out.println(new Solution050().FirstNotRepeatingChar(s));
    }

    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        int[] freq = new int[256];
        char[] arr = str.toCharArray();
        for (char c : arr) {
            freq[c]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (freq[arr[i]] == 1) {
                return i;
            }
        }
        return -1;
    }

    public int FirstNotRepeatingChar2(String str) {
        BitSet bs1 = new BitSet(256);
        BitSet bs2 = new BitSet(256);
        for (char c: str.toCharArray()) {
            if (!bs1.get(c) && !bs2.get(c)) {
                bs1.set(c);
            } else if (bs1.get(c) && !bs2.get(c)) {
                bs2.set(c);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (bs1.get(c) && !bs2.get(c)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
     * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
     * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
     */

    int[] freq = new int[256];
    int index;

    {
        Arrays.fill(freq, -1);
        index = 0;
    }

    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if (freq[ch] == -1) {
            freq[ch] = index;
        } else if (freq[ch] >= 0) {
            freq[ch] = -2;
        }
        index++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int minIndex = Integer.MAX_VALUE;
        char ch = '#';
        for (int i = 0; i < 256; i++) {
            if (freq[i] >= 0 && freq[i] < minIndex) {
                ch = (char) i;
                minIndex = freq[i];
            }
        }
        return ch;
    }

}
