package ds.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/16
 */

public class Graph {

    /**
     * 顶点个数
     */
    private int v;

    /**
     * 邻接表
     */
    private LinkedList<Integer>[] adjacent;

    /**
     * 找没找到
     */
    private boolean found;

    @SuppressWarnings("unchecked")
    public Graph(int v) {
        this.v = v;
        adjacent = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacent[i] = new LinkedList<>();
        }
    }

    /**
     * 添加边
     *
     * @param s 顶点 s
     * @param t 顶点 t
     */
    public void addEdge(int s, int t) {
        adjacent[s].add(t);
        adjacent[t].add(s);
    }

    /**
     * 从 s 到 t 的深度优先搜索
     *
     * @param s 顶点 s
     * @param t 顶点 t
     */
    public void dfs(int s, int t) {
        found = false;
        boolean[] visited = new boolean[v];
        int[] prev = new int[v];
        Arrays.fill(prev, -1);
        recurDfs(s, t, visited, prev);
        print(prev, s, t);
    }

    private void recurDfs(int w, int t, boolean[] visited, int[] prev) {
        if (found) {
            return;
        }
        visited[w] = true;
        if (w == t) {
            found = true;
            return;
        }
        for (int i = 0; i < adjacent[w].size(); i++) {
            int q = adjacent[w].get(i);
            if (!visited[q]) {
                prev[q] = w;
                recurDfs(q, t, visited, prev);
            }
        }
    }

    /**
     * 从 s 到 t 的广度搜索算法
     *
     * @param s 顶点 s
     * @param t 顶点 t
     */
    public void bfs(int s, int t) {
        if (s == t) {
            return;
        }
        // visited 表明哪些顶点被访问过了
        boolean[] visited = new boolean[v];
        visited[s] = true;
        // 保存所有被访问过的顶点
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);

        // 搜索路径
        int[] pre = new int[v];
        Arrays.fill(pre, -1);

        // 地毯式扫描
        while (!queue.isEmpty()) {
            int w = queue.poll();
            // 将与之相连的顶点加入queue
            for (int i = 0; i < adjacent[w].size(); i++) {
                int q = adjacent[w].get(i);
                if (!visited[q]) {
                    pre[q] = w;
                    if (q == t) {
                        print(pre, s, t);
                        return;
                    }
                    visited[q] = true;
                    queue.add(q);
                }
            }
        }
    }

    private void print(int[] prev, int s, int t) {
        if (prev[t] != -1 && t != s) {
            print(prev, s, prev[t]);
        }
        System.out.println(t + " ");
    }


}
