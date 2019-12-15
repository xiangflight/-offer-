package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> record = new HashMap<>();
        for (int num : nums1) {
            record.put(num, record.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (record.containsKey(num) && record.get(num) > 0) {
                list.add(num);
                record.put(num, record.get(num) - 1);
            }
        }
        int[] res = new int[list.size()];
        int idx = 0;
        for (int num : list) {
            res[idx++] = num;
        }
        return res;
    }

}
