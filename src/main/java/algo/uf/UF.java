package algo.uf;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/18
 */

public class UF implements IUnionFind {
    /**
     * 记录连通分量的个数
     */
    private int count;
    /**
     * 节点 x 的父节点是 parent[x]
     */
    private int[] parent;
    /**
     * 记录每棵树的重量
     */
    private int[] size;

    public UF(int n) {
        this.count = n;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) {
            return;
        }
        // 尽量保证树平衡，这样高度就会大致在 logN 数量级
        if (size[rootP] > size[rootQ]) {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        } else {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        count--;
    }

    private int find(int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    @Override
    public boolean connected(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        return rootP == rootQ;
    }

    @Override
    public int count() {
        return count;
    }
}
