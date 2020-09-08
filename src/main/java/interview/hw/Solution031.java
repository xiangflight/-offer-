package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/7
 */

public class Solution031 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuilder builder = new StringBuilder();
            String line = sc.nextLine();
            String[] words = line.split("[^A-Za-z]");
            for (int i = words.length - 1; i >= 0; i--) {
                builder.append(words[i]).append(" ");
            }
            System.out.println(builder.toString().trim());
        }
        sc.close();
    }

}
