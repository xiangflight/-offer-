package interview.hw;

import java.util.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/2
 * <p>
 * 题目描述：
 * <p>
 * 有一种技巧可以对数据进行加密，它使用一个单词作为它的密匙。下面是它的工作原理：首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，只保留第1个，其余几个丢弃。现在，修改过的那个单词属于字母表的下面，如下所示：
 * <p>
 * A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 * <p>
 * T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
 * <p>
 * 上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，信息中的每个字母被固定于顶上那行，并用下面那行的对应字母一一取代原文的字母(字母字符的大小写状态应该保留)。因此，使用这个密匙，Attack AT DAWN(黎明时攻击)就会被加密为Tpptad TP ITVH。
 * <p>
 * 请实现下述接口，通过指定的密匙和明文得到密文。
 * <p>
 * 输入：
 * <p>
 * nihao
 * ni
 * <p>
 * 输出：
 * le
 */

public class Solution036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String key = sc.nextLine();
            String plainText = sc.nextLine();
            String password = encrypt(key, plainText);
            System.out.println(password);
        }
        sc.close();
    }

    private static String encrypt(String key, String plainText) {
        Set<Character> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        for (char c : key.toCharArray()) {
            char clow = Character.toLowerCase(c);
            if (set.contains(clow)) {
                continue;
            }
            builder.append(clow);
            set.add(clow);
        }

        String newValue = builder.toString();
        Map<Character, Character> map = new HashMap<>(26);
        int i;
        for (i = 0; i < newValue.length(); i++) {
            map.put((char) ('a' + i), newValue.charAt(i));
        }
        if (i < 26) {
            for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
                if (set.contains(c)) {
                    continue;
                }
                map.put((char) ('a' + i), c);
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c: plainText.toCharArray()) {
            if (c == ' ') {
                sb.append(' ');
            } else {
                char clow = Character.toLowerCase(c);
                if (Character.isLowerCase(c)) {
                    sb.append(Character.toLowerCase(map.get(clow)));
                } else {
                    sb.append(Character.toUpperCase(map.get(clow)));
                }
            }
        }
        return sb.toString();
    }

}
