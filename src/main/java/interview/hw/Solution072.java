package interview.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/27
 */

public class Solution072 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<Combination> ans = new ArrayList<>();
            for (int i = 0; i < (100 / 5 + 1); i++) {
                for (int j = 0; j < (100 / 3 + 1); j++) {
                    for (int k = 0; k < (100 * 3 + 1); k++) {
                        if ((i + j + k == 100) && (k % 3 == 0) && (5 * i + 3 * j + (k / 3) == 100)) {
                            ans.add(new Combination(i, j, k));
                        }
                    }
                }
            }
            ans.forEach (Combination::print);
        }
        sc.close();
    }

}

class Combination {

    int m;
    int n;
    int k;

    public Combination(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
    }

    public void print() {
        System.out.println(m + " " + n + " " + k);
    }

}
