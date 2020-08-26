package interview.hw;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/25
 * <p>
 * 题目描述
 * 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
 * <p>
 * <p>
 * 处理：
 * <p>
 * <p>
 * 1、 记录最多8条错误记录，循环记录（或者说最后只输出最后出现的八条错误记录），对相同的错误记录（净文件名（保留最后16位）称和行号完全匹配）只记录一条，错误计数增加；
 * <p>
 * <p>
 * 2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
 * <p>
 * <p>
 * 3、 输入的文件可能带路径，记录文件名称不能带路径。
 * <p>
 * 输入描述:
 * 一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。
 * <p>
 * 输出描述:
 * 将所有的记录统计并将结果输出，格式：文件名 代码行数 数目，一个空格隔开，如：
 * <p>
 * 输入：
 * E:\V1R2\product\fpgadrive.c   1325
 * <p>
 * 输出：
 * fpgadrive.c 1325 1
 */

public class Solution019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] strArr = line.split("\\s+");
            String fileName = strArr[0].substring(strArr[0].lastIndexOf("\\") + 1);
            String lineNum = strArr[1];
            String key = fileName.substring(Math.max(0, fileName.length() - 16)) + " " + lineNum;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (map.size() - count <= 8) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            count++;

        }
        sc.close();
    }

}
