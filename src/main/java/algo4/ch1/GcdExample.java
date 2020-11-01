package algo4.ch1;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/10/1
 */

public class GcdExample {

    public static void main(String[] args) {
        int gcd = gcd(3, 9);
        System.out.println(gcd);
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

}
