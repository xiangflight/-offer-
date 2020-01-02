package swordoffer;

import java.util.PriorityQueue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/2
 * <p>
 * 如何得到一个数据流中的中位数？
 * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，
 * 使用GetMedian()方法获取当前读取数据的中位数。
 */

public class Solution041 {

    private PriorityQueue<Integer> left = new PriorityQueue<>(((o1, o2) -> o2 - o1));

    private PriorityQueue<Integer> right = new PriorityQueue<>();

    private int n = 0;

    /**
     * 插入到保证两边平衡
     *
     * 当前数据总数目是偶数时，把新数据插入最小堆，否则插入最大堆
     *
     * @param num num
     */
    public void Insert(Integer num) {
        if ((n & 1) == 0) {
            left.add(num);
            right.offer(left.poll());
        } else {
            right.add(num);
            left.offer(right.poll());
        }
        n++;
    }

    public Double GetMedian() {
        if ((n & 1) == 0) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return (double) right.peek();
        }
    }

}
