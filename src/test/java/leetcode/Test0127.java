package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/19
 */

class Test0127 {

    private final Solution0127 solution = new Solution0127();

    @Test
    @DisplayName("127 Word Ladder")
    void ladderLength() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int expected = 5;
        assertEquals(expected, solution.ladderLength(beginWord, endWord, wordList));
    }
}