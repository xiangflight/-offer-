package labuladong.ch2;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/7
 */

public interface ICache {

    int get(int key);


    void put(int key, int val);

}
