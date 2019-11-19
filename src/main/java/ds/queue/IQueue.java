package ds.queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/19
 */

public interface IQueue {

    /**
     * 入队
     *
     * @param item 入队的元素
     * @return 是否入队成功
     */
    boolean enqueue(String item);

    /**
     * 出队
     *
     * @return 队头的元素
     */
    String dequeue();

    /**
     * 打印队列中所有元素
     */
    void printAll();

}
