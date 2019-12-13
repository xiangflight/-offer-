package algo.backtracking;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/13
 */

public class StringPermutation {

    public static void main(String[] args) {
        new StringPermutation().permutation("abc");
    }

    /**
     * print permutations of a given string
     *
     * @param str a given string
     */
    public void permutation(String str) {
        permutation(str, "");
    }

    private void permutation(String str, String prefix) {
        if (0 == str.length()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

}
