package labuladong.ch2;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/7
 */

public class BinaryHeap {

    int parent(int root) {
        return root / 2;
    }

    int left(int root) {
        return root * 2;
    }

    int right(int root) {
        return root * 2 + 1;
    }

}

class MaxPQ<Key extends Comparable<Key>> {

    private Key[] pq;

    private int N = 0;

    public MaxPQ(int cap) {
        pq = (Key[]) new Comparable[cap + 1];
    }

    public Key max() {
        return pq[1];
    }

    public void insert(Key key) {
        N++;
        pq[N] = key;
        swim(N);
    }

    public Key delMax() {
        Key max = pq[1];
        exchange(1, N);
        pq[N] = null;
        N--;
        sink(1);
        return max;
    }

    public void swim(int k) {
        while (k > 1 && less(parent(k), k)) {
            exchange(parent(k), k);
            k = parent(k);
        }
    }

    public void sink(int k) {
        while (left(k) <= N) {
            int older = left(k);
            if (right(k) <= N && less(older, right(k))) {
                older = right(k);
            }
            if (less(older, k)) {
                break;
            }
            exchange(k, older);
            k = older;
        }
    }

    private void exchange(int i, int j) {
        Key temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    int parent(int k) {
        return k / 2;
    }

    int left(int k) {
        return k * 2;
    }

    int right(int k) {
        return k * 2 + 1;
    }
}
