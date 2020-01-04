package swordoffer;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/3
 *
 * 五张牌，其中大小鬼为癞子，牌面为 0。判断这五张牌是否能组成顺子。
 */

public class Solution061 {

    public boolean isContinuous(int [] numbers) {
        if (numbers.length < 5) {
            return false;
        }
        Arrays.sort(numbers);
        int cnt = 0;
        for (int num: numbers) {
            if (num == 0) {
                cnt++;
            }
        }
        for (int i = cnt; i < numbers.length - 1; i++) {
            if (numbers[i + 1] == numbers[i]) {
                return false;
            }
            cnt -= (numbers[i+1] - numbers[i] - 1);
        }
        return cnt >= 0;
    }

}
