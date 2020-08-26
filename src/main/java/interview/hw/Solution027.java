package interview.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/26
 */

public class Solution027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            String word = sc.next();
            int index = sc.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for (String element : arr) {
                if (isSibling(word, element)) {
                    list.add(element);
                }
            }
            System.out.println(list.size());
            Collections.sort(list);
            if (index <= list.size()) {
                System.out.println(list.get(index - 1));
            }
        }
        sc.close();
    }

    private static boolean isSibling(String word, String match) {
        if (word.length() != match.length()) {
            return false;
        }
        if (Objects.equals(word, match)) {
            return false;
        }
        int[] dic = new int[26];
        for (char c : word.toCharArray()) {
            dic[c - 'a']++;
        }
        for (char c : match.toCharArray()) {
            if (dic[c - 'a'] == 0) {
                return false;
            }
            dic[c - 'a']--;
        }
        return true;
    }

}
