package labuladong.ch3;

import java.util.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/10
 */

public class TwoSum {

    List<Integer> nums = new ArrayList<>();

    Set<Integer> sum = new HashSet<>();

    public void add(int number) {
        for (int n: nums) {
            sum.add(n + number);
        }
        nums.add(number);
    }

    public boolean find(int value) {
        return sum.contains(value);
    }

}
