package ds.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SplittableRandom;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/19
 * <p>
 * Java 中的 PriorityQueue 默认是最小堆
 * <p>
 * 要改成最大堆，构造函数需要改成 new PriorityQueue<>(Comparator.reverseOrder());
 * <p>
 * 或者 自定义 Comparator，如：new PriorityQueue<>(Comparator.comparingInt(o -> (- o % 10))); 个位数 从大到小 排列
 */

public class PriorityQueueDs {

    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> (-o % 10)));
        SplittableRandom random = new SplittableRandom();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            priorityQueue.offer(num);
            System.out.println(String.format("insert %d in priority queue.", num));
        }
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
        System.out.println();
    }

}
