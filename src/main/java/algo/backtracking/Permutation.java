package algo.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/13
 */

public class Permutation {

    List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 2};
        List<List<Integer>> permute = new Permutation().permute(nums);
        permute.forEach(System.out::println);
    }

    List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(track, nums);
        return res;
    }

    /**
     * 路径：记录在 track 中
     * 选择列表：nums 中不存在 track 中的元素
     * 结束条件：nums 中所有的元素都在 track 中出现
     *
     * @param track 路径
     * @param nums  数组
     */
    private void backtrack(LinkedList<Integer> track, int[] nums) {
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }
        for (int num : nums) {
            if (track.contains(num)) {
                continue;
            }
            track.add(num);
            backtrack(track, nums);
            track.removeLast();
        }
    }

}
