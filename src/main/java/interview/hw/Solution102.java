package interview.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/8
 */

public class Solution102 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String result = count(str);
            System.out.println(result);
        }
    }

    static String count(String str) {
        char[] strArr = str.toCharArray();
        int[] chArray = new int[129];
        for (char i: strArr) {
            chArray[(int)i]++;
        }
        int max = 0;
        for (int i = 0; i < chArray.length; i++) {
            if (max < chArray[i]) {
                max = chArray[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        while (max != 0) {
            for (int i = 0; i < chArray.length; i++) {
                if (chArray[i] == max) {
                    sb.append((char)i);
                }
            }
            max--;
        }
        return sb.toString();
    }

}
