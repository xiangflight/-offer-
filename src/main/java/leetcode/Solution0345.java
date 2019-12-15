package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0345 {

    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        if (s.length() == 0) {
            return s;
        }
        char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (notVowel(arr[i]) && i < j) {
                i++;
            }
            while (notVowel(arr[j]) && i < j) {
                j--;
            }
            if (i >= j) {
                break;
            }
            swap(arr, i, j);
            i++;
            j--;
        }
        return new String(arr);
    }

    private void swap(char[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private boolean notVowel(char c) {
        return !vowels.contains(c);
    }

}
