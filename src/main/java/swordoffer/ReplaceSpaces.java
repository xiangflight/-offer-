package swordoffer;

import utils.Assert;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/5
 */

class ReplaceSpaces {

    /**
     * 替换空格为任意字符串 token
     *
     * @param str 输入字符串
     */
    String replaceSpaces(String str, String token) {
        Assert.checkNotNull(str);
        Assert.checkNotNull(token);
        final char space = ' ';
        int cnt = 0;
        for (char c : str.toCharArray()) {
            if (space == c) {
                cnt++;
            }
        }

        char[] tokenArr = token.toCharArray();
        int tokenLen = tokenArr.length;

        char[] newArr = new char[str.length() + cnt * (tokenLen - 1)];

        int i = str.length() - 1, j = newArr.length - 1;
        while (i >= 0) {
            if (str.charAt(i) != space) {
                newArr[j--] = str.charAt(i);
            } else {
                int tmp = tokenLen;
                while (tmp > 0) {
                    newArr[j--] = tokenArr[--tmp];
                }
            }
            i--;
        }
        return String.valueOf(newArr);
    }

}
