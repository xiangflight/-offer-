package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/2
 */

public class Solution038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            Pair result = distance(n);
            System.out.printf("%.6f\n", result.distance);
            System.out.printf("%.6f", result.lastHeight);
        }
        sc.close();
    }

    private static Pair distance(double n) {
        double result = 0d;
        double initial = n;
        for (int i = 0; i < 5; i++) {
            result += (2 * n);
            n = n / 2;
        }
        return new Pair(result - initial, n);
    }

    public static class Pair {

        double distance;

        double lastHeight;

        public Pair(double distance, double lastHeight) {
            this.distance = distance;
            this.lastHeight = lastHeight;
        }
    }

}
