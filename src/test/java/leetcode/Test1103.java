package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/5
 */

class Test1103 {

    private final Solution1103 solution = new Solution1103();

    @Test
    @DisplayName("1103 Distribute Candies To People")
    void distributeCandies() {
        int candies = 7, num_people = 4;
        assertArrayEquals(new int[] {1, 2, 3, 1}, solution.distributeCandies(candies, num_people));
        candies = 10;
        num_people = 3;
        assertArrayEquals(new int[] {5, 2, 3}, solution.distributeCandies(candies, num_people));
    }
}