package interview.bytedance;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/26
 */

public class Solution0005 {

    public static void main(String[] args) {
        String result = new Solution0005().reverseWords(" ");
        System.out.println(result);
    }

    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder builder = new StringBuilder();
        char last = ' ';
        for (char c: s.toCharArray()) {
            if (c == ' ' && last == ' ') {
                continue;
            }
            builder.append(c);
            last = c;
        }
        if (last == ' ' && builder.length() != 0) {
            builder.deleteCharAt(builder.length() - 1);
        }
        String wholeReverse = reverseWord(builder.toString());
        builder.delete(0, builder.length());
        for (String each: wholeReverse.split(" ")) {
            builder.append(reverseWord(each)).append(" ");
        }
        if (builder.length() != 0) {
            builder.deleteCharAt(builder.length() - 1);
        }
        return builder.toString();
    }

    String reverseWord(String word) {
        char[] arr = word.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            swap(arr, i, j);
        }
        return new String(arr);
    }

    void swap(char[] arr, int i, int j) {
        if (i != j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
