package interview.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/7
 */

public class Solution045 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            for (int i = 0; i < n; i++) {
                String name = br.readLine().toLowerCase();
                int result = maxBeautyValue(name);
                System.out.println(result);
            }
        }
    }

    static int maxBeautyValue(String name) {
        int[] counter = new int[26];
        for (char c : name.toCharArray()) {
            counter[c - 'a']++;
        }
        Arrays.sort(counter);
        int result = 0;
        int weight = 26;
        for (int i = counter.length - 1; i >= 0; i--) {
            if (counter[i] != 0) {
                result += (weight * counter[i]);
                weight--;
            }
        }
        return result;
    }

}