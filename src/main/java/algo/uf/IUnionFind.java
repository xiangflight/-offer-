package algo.uf;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/18
 */

public interface IUnionFind {

    /**
     * 连通 p 和 q
     *
     * @param p p
     * @param q q
     */
    void union(int p, int q);

    /**
     * p 和 q 是否连通
     *
     * @param p p
     * @param q q
     * @return true if 连通
     */
    boolean connected(int p, int q);

    /**
     * 有多少连通分量
     *
     * @return 连通分量个数
     */
    int count();

}
