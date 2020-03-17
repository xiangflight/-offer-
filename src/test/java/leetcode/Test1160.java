package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/17
 *
 *  * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 *  * 输出：6
 *  * 解释：
 *  * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 *  *
 *  * 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 *  * 输出：10
 *  * 解释：
 *  * 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 *  *
 *  * 1 <= words.length <= 1000
 *  * 1 <= words[i].length, chars.length <= 100
 *  * 所有字符串中都仅包含小写英文字母
 */

class Test1160 {

    private final Solution1160 solution = new Solution1160();

    @Test
    @DisplayName("find words can be formed by characters")
    void countCharacters() {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int expected = 6;
        assertEquals(expected, solution.countCharacters(words, chars));
        words = new String[] {"hello", "world", "leetcode"};
        chars = "welldonehoneyr";
        expected = 10;
        assertEquals(expected, solution.countCharacters(words, chars));
    }
}