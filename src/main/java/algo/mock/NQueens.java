package algo.mock;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/7
 */

public class NQueens {

    public static void main(String[] args) {
    }

    List<List<Integer>> res = new ArrayList<>();

    void backtrack(int[] nums, LinkedList<Integer> track) {
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }
            track.add(nums[i]);
            backtrack(nums, track);
            track.removeLast();
        }
    }

}
