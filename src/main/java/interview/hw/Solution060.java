package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/9
 */

public class Solution060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            solution(n);
        }
        sc.close();
    }

    static void solution(int n) {
        int mid = n / 2;
        int left= mid;
        int right = mid;
        while (left >= 2) {
            if (isPrime(left) && isPrime(right)) {
                System.out.println(left);
                System.out.println(right);
                break;
            }
            left--;
            right++;
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
