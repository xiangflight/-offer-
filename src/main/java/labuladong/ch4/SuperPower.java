package labuladong.ch4;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/10
 */

public class SuperPower {

    int myPower(int a, int k) {
        if (k == 0) {
            return 1;
        }
        if (k == 1) {
            return a;
        }
        if ((k % 2) == 0) {
            int sub = myPower(a, k / 2);
            return sub * sub;
        } else {
            return a * myPower(a, k - 1);
        }
    }

    public int superPow(int a, int[] b) {
        return 0;
    }

    public static void main(String[] args) {
        int res = new SuperPower().myPower(2, 4);
        System.out.println(res);
    }

}