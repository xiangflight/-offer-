package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/10
 * <p>
 * We have two special characters.
 * The first character can be represented by one bit 0.
 * The second character can be represented by two bits (10 or 11).
 * <p>
 * Now given a string represented by several bits.
 * Return whether the last character must be a one-bit character or not.
 * The given string will always end with a zero.
 */

public class Solution0717 {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param bits 输入数组
     * @return true if must be a one-bit character
     */
    public boolean isOneBitCharacter(int[] bits) {
        if (bits == null || bits.length == 0) {
            return false;
        }
        int i = 0;
        while (i < bits.length - 1) {
            i += (bits[i] + 1);
        }
        return i == bits.length - 1;
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * <p>
     * 三种字符分别为 0，10 和 11，那么 bits 数组中出现的所有 0 都表示一个字符的结束位置（无论其为一比特还是两比特）。
     * 因此最后一位是否为一比特字符，只和他左侧出现的连续的 1 的个数有关。
     * 即它与倒数第二个 0 出现的位置之间的 1 的个数，如果 bits 数组中只有 1 个 0，那么就是整个数组的长度减1
     * 如果 1 的个数为偶数个，那么最后一位是一比特字符，
     * 如果 1 的个数为奇数个，那么最后一位不是一比特字符。
     *
     * @param bits 输入数组
     * @return true if must be a one-bit character
     */
    public boolean isOneBitCharacter1(int[] bits) {
        if (bits == null || bits.length == 0) {
            return false;
        }
        int i = bits.length - 2;
        while (i >= 0 && bits[i] > 0) {
            i--;
        }
        return ((bits.length - i) & 1) == 0;
    }

}
