package algo.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/20
 */

public class RecursiveExample {


    static Map<Integer, Integer> map = new HashMap<>();

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return f(n - 1) + 1;
    }

    public static int fPerf(int n) {
        int ret = 1;
        for (int i = 2; i <= n; i++) {
            ret++;
        }
        return ret;
    }

    public static int onStep(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return onStep(n - 1) + onStep(n - 2);
    }

    public static int onStepPer(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int ret = onStep(n - 1) + onStep(n - 2);
        map.put(n, ret);
        return ret;
    }

    public static int onStepPerf(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int ret = 0;
        int pre = 2;
        int prePre = 1;
        for (int i = 3; i <= n; i++) {
            ret = pre + prePre;
            prePre = pre;
            pre = ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(f(11));
        System.out.println(onStep(11));
    }

}
