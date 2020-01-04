package swordoffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/3
 *
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 对应每个测试案例，输出两个数，小的先输出。
 */

public class Solution057 {

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        if (array == null || array.length == 0) {
            return new ArrayList<>();
        }
        int i = 0, j = array.length - 1;
        while (i < j) {
            int curSum = array[i] + array[j];
            if (curSum == sum) {
                return new ArrayList<>(Arrays.asList(array[i], array[j]));
            }
            if (curSum > sum) {
                j--;
            } else {
                i++;
            }
        }
        return new ArrayList<>();
    }

    /**
     * 输出所有和为 S 的连续正数序列。
     *
     * 例如和为 100 的连续序列有：
     *
     * [9, 10, 11, 12, 13, 14, 15, 16]
     * [18, 19, 20, 21, 22]。
     *
     * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
     *
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int l = 1, r = 2;
        int curSum = 3;
        while (r < sum) {
            if (curSum == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = l; i <= r; i++) {
                    list.add(i);
                }
                res.add(list);
                curSum -= l;
                l++;
                r++;
                curSum += r;
            } else if (curSum < sum) {
                r++;
                curSum += r;
            } else {
                curSum -= l;
                l++;
            }
        }
        return res;
    }

}
