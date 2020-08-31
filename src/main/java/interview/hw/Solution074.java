package interview.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/30
 * <p>
 * 题目描述
 * 在命令行输入如下命令：
 * <p>
 * xcopy /s c:\ d:\，
 * <p>
 * 各个参数如下：
 * <p>
 * 参数1：命令字xcopy
 * <p>
 * 参数2：字符串/s
 * <p>
 * 参数3：字符串c:\
 * <p>
 * 参数4: 字符串d:\
 * <p>
 * 请编写一个参数解析程序，实现将命令行各个参数解析出来。
 * <p>
 * <p>
 * <p>
 * 解析规则：
 * <p>
 * 1.参数分隔符为空格
 * 2.对于用“”包含起来的参数，如果中间有空格，不能解析为多个参数。比如在命令行输入xcopy /s “C:\program files” “d:\”时，参数仍然是4个，第3个参数应该是字符串C:\program files，而不是C:\program，注意输出参数时，需要将“”去掉，引号不存在嵌套情况。
 * 3.参数不定长
 * 4.输入由用例保证，不会出现不符合要求的输入
 * <p>
 * 输入：
 * xcopy /s c:\\ d:\\
 * <p>
 * 输出：
 * 4
 * xcopy
 * /s
 * c:\\
 * d:\\
 */

public class Solution074 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split(" ");
        System.out.println(strings.length);
        for (String temp : strings) {
            if (temp.charAt(0) != '\"') {
                System.out.println(temp);
            } else {
                System.out.println(temp.substring(1, temp.length() - 1));
            }
        }
    }

}
