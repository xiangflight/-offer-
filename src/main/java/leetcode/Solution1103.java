package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/5
 * <p>
 * Difficulty: Easy
 */

public class Solution1103 {

    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int i = 0;
        while (candies != 0) {
            int index = i % num_people;
            int round = i / num_people;
            int each = Math.min(index + 1 + round * num_people, candies);
            res[index] += each;
            candies -= each;
            i++;
        }
        return res;
    }

}
