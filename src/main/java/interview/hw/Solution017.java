package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/25
 * <p>
 * 题目描述
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 * <p>
 * 输入：
 * <p>
 * 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 * <p>
 * 坐标之间以;分隔。
 * <p>
 * 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
 * <p>
 * 下面是一个简单的例子 如：
 * <p>
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 * <p>
 * 处理过程：
 * <p>
 * 起点（0,0）
 * <p>
 * +   A10   =  （-10,0）
 * <p>
 * +   S20   =  (-10,-20)
 * <p>
 * +   W10  =  (-10,-10)
 * <p>
 * +   D30  =  (20,-10)
 * <p>
 * +   x    =  无效
 * <p>
 * +   A1A   =  无效
 * <p>
 * +   B10A11   =  无效
 * <p>
 * +  一个空 不影响
 * <p>
 * +   A10  =  (10,-10)
 * <p>
 * 结果 （10， -10）
 * <p>
 * 注意请处理多组输入输出
 * <p>
 * 输入描述:
 * 一行字符串
 * <p>
 * 输出描述:
 * 最终坐标，以,分隔
 */

public class Solution017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Coordinate coordinate = new Coordinate(0, 0);
            String line = sc.nextLine();
            String[] operations = line.split(";");
            for (String operation : operations) {
                if (invalid(operation)) {
                    continue;
                }
                coordinate.operate(operation.charAt(0), Integer.parseInt(operation.substring(1)));
            }
            coordinate.print();
        }
    }

    private static boolean invalid(String operation) {
        if (operation.length() < 2) {
            return true;
        }
        if (!validStart(operation.charAt(0))) {
            return true;
        }
        for (char c : operation.substring(1).toCharArray()) {
            if (c < '0' || c > '9') {
                return true;
            }
        }
        return false;
    }

    private static boolean validStart(char c) {
        return 'A' == c || 'W' == c || 'S' == c || 'D' == c;
    }

}

class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(String.format("%d,%d", x, y));
    }

    public void operate(char c, int num) {
        switch (c) {
            case 'A':
                this.x -= num;
                break;
            case 'W':
                this.y += num;
                break;
            case 'S':
                this.y -= num;
                break;
            case 'D':
                this.x += num;
                break;
            default:
        }
    }

}
