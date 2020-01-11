package cc189;

import java.util.ArrayList;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/9
 * <p>
 * all integers are distinct
 */

public class Solution0807 {

    public static void main(String[] args) {
        String s = "abc";
        Solution0807 solution = new Solution0807();
        ArrayList<String> perms = solution.getPerms(s);
        System.out.println(perms);
    }

    ArrayList<String> getPerms1(String str) {
        if (str == null) {
            return null;
        }
        ArrayList<String> permutations = new ArrayList<>();
        if (str.length() == 0) {
            permutations.add("");
            return permutations;
        }
        /* important */
        char first = str.charAt(0);
        String remainder = str.substring(1);
        ArrayList<String> words = getPerms1(remainder);
        for (String word : words) {
            for (int j = 0; j <= word.length(); j++) {
                String s = insertCharAt(word, first, j);
                permutations.add(s);
            }
        }
        return permutations;
    }

    /**
     * Insert char c at index i in word.
     *
     * @param word word
     * @param c    c
     * @param i    i
     * @return new permutation
     */
    private String insertCharAt(String word, char c, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;
    }

    ArrayList<String> getPerms2(String remainder) {
        int len = remainder.length();
        ArrayList<String> result = new ArrayList<>();

        /* Base Case. */
        if (len == 0) {
            result.add("");
            return result;
        }

        for (int i = 0; i < len; i++) {
            String before = remainder.substring(0, i);
            String after = remainder.substring(i + 1, len);
            ArrayList<String> partials = getPerms2(before + after);
            for (String s: partials) {
                result.add(remainder.charAt(i) + s);
            }
        }
        return result;
    }

    ArrayList<String> getPerms(String str) {
        ArrayList<String> result = new ArrayList<>();
        getPerms("", str, result);
        return result;
    }

    private void getPerms(String prefix, String remainder, ArrayList<String> result) {
        if (remainder.length() == 0) {
            result.add(prefix);
        }
        int len = remainder.length();
        for (int i = 0; i < len; i++) {
            String before = remainder.substring(0, i);
            String after = remainder.substring(i + 1, len);
            char c = remainder.charAt(i);
            getPerms(prefix + c, before + after, result);
        }
    }

}
